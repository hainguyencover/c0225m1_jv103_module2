public class UserController {
    private UserStorage userStorage;

    public UserController(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public void storeUser(User user) {
        System.out.println("UserController: Storing user...");
        userStorage.store(user);
        System.out.println("UserController: User stored successfully.");
    }

    public void setUserStorage(UserStorage userStorage) {
        this.userStorage = userStorage;
    }
}
