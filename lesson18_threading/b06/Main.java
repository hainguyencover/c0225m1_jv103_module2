package b06;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new LazyPrimeFactorization());
        Thread thread2 = new Thread(new OptimizedPrimeFactorization());

        thread1.start();
        thread2.start();
    }
}
