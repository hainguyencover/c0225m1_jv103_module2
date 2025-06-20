package b05;

public class Main {
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();

        odd.start();
        try {
            odd.join();
        } catch (InterruptedException e) {
            System.out.println("Thiet bi gian doan: " + e.getMessage());
        }
        even.start();
        try {
            even.join();
        } catch (InterruptedException e) {
            System.out.println("Thiet bi gian doan: " + e.getMessage());
        }
    }
}
