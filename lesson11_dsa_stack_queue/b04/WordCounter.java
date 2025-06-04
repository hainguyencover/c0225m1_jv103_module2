package b04;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi van ban:");
        String input = scanner.nextLine();

        // Chuyển về chữ thường, tách từ dựa trên khoảng trắng & ký tự không phải chữ
        String[] words = input.toLowerCase().split("[^a-zA-Z0-9]+");

        TreeMap<String, Integer> wordMap = new TreeMap<>();

        for (String word : words) {
            if (word.isEmpty())
                continue; // bỏ qua từ rỗng

            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        System.out.println("\nTu va so lan xuat hien:");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
