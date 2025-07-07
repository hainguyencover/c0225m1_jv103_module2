public class MySQLStorage implements UserStorage {
    // Thông tin kết nối CSDL (chỉ là ví dụ)
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    @Override
    public void store(User user) {
        System.out.println("MySQLStorage: Storing user '" + user.getName() + "' to MySQL Database.");
        System.out.println("MySQLStorage: (Simulated) User '" + user.getName() + "' stored in MySQL.");
    }
}
