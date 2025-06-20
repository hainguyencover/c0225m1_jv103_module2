package b04;

public class NumberGenerator implements Runnable {
    private String name;

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - So: " + i + " | HashCode: " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Thread bi gian doan: " + e.getMessage());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
