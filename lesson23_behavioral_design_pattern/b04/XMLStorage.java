import java.io.FileWriter;
import java.io.IOException;

public class XMLStorage implements UserStorage {
    private static final String XML_FILE_PATH = "users.xml";

    @Override
    public void store(User user) {
        System.out.println("XMLStorage: Storing user '" + user.getName() + "' to XML file: " + XML_FILE_PATH);
        // Trong thực tế, bạn sẽ ghi đối tượng user vào file XML tại đây.
        // Ví dụ đơn giản:
        try (FileWriter writer = new FileWriter(XML_FILE_PATH, true)) { // true để append
            writer.write("<user>\n");
            writer.write("  <username>" + user.getName() + "</username>\n");
            writer.write("  <age>" + user.getAge() + "</age>\n");
            writer.write("</user>\n");
            System.out.println("XMLStorage: User data written to " + XML_FILE_PATH);
        } catch (IOException e) {
            System.err.println("XMLStorage: Error writing to XML file: " + e.getMessage());
        }
    }
}
