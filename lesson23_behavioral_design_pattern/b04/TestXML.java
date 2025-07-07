public class TestXML {
    public static void main(String[] args) {
        System.out.println("--- Test với XMLStorage ---");
        UserStorage xmlStorage = new XMLStorage();
        UserController xmlUserController = new UserController(xmlStorage);
        User user1 = new User("nguyenvana", 13);
        xmlUserController.storeUser(user1);
        System.out.println("\n"); // Để dễ nhìn kết quả
    }
}
