import java.util.Random;

public class StopWatch {
    private long startTime;
    private long endTime;

    public static void main(String[] args) {
        int[] array = new int[100000];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000000);  // Ngẫu nhiên từ 0 -> 999999
        }

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        selectionSort(array);

        stopwatch.stop();

        System.out.println("Thời gian thực thi thuật toán selection sort: " + stopwatch.getElapsedTime() + " ms");
        System.out.println(stopwatch.display());
    }

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public String display() {
        return "Start Time: " + startTime + " End Time: " + endTime + " Elapsed Time: " + getElapsedTime() + " milliseconds";
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
