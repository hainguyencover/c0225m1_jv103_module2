public class TestMySQL {
    public static void main(String[] args) {
        System.out.println("--- Test với MySQLStorage ---");
        UserStorage mysqlStorage = new MySQLStorage();
        UserController mysqlUserController = new UserController(mysqlStorage);
        User user2 = new User("tranthib", 12);
        mysqlUserController.storeUser(user2);
        System.out.println("\n");
    }
}
