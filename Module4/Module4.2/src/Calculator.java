public class Calculator {
    private int sum;

    public Calculator() {
        this.sum = 0;
    }

    public void reset() {
        this.sum = 0;
    }

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        this.sum += number;
    }

    public int getSum() {
        return this.sum;
    }
}
