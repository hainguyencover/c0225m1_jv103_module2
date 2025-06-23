package b06;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawNewsExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");

            Scanner scanner = new Scanner(new InputStreamReader(url.openStream(), "UTF-8"));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            // Remove new lines and spaces
            content = content.replaceAll("\\n+", "").replaceAll("\\s{2,}", " ");

            // Regex to find article titles and links
            Pattern pattern = Pattern.compile("article-title\">\\s*<a href=\"(.*?)\"[^>]*>(.*?)</a>");
            Matcher matcher = pattern.matcher(content);

            int count = 1;
            while (matcher.find()) {
                String link = "https://dantri.com.vn" + matcher.group(1);
                String title = matcher.group(2).trim();
                System.out.println(count++ + ". " + title);
                System.out.println("   Link: " + link);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
