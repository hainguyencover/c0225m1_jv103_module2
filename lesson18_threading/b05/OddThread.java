package b05;

public class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Le: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("OddThread bi gian doan: " + e.getMessage());
            }
        }
    }
}
