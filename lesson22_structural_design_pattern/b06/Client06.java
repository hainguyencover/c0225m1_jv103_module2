import java.util.HashSet;
import java.util.Set;

public class Client06 {
    private CollectionOperations collectionOperations;

    // Sửa tên constructor (đang sai thành "Client")
    public Client06(CollectionOperations collectionOperations) {
        this.collectionOperations = collectionOperations;
    }

    public void printMaxValue(Set<Integer> numbers) {
        int max = collectionOperations.findMax(numbers);
        System.out.println("Max value is: " + max);
    }

    // Hàm main để test
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(2);
        numbers.add(7);

        CollectionOperations collectionOperations = new CollectionUtilsAdapter();

        Client06 client = new Client06(collectionOperations);
        client.printMaxValue(numbers);
    }
}
