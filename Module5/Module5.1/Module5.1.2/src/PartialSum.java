public class PartialSum implements Runnable {
    private int start;
    private int end;
    private long sum;

    public PartialSum(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}