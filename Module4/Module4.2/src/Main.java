public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.add(10);
        calculator.add(15);
        System.out.println("Sum: " + calculator.getSum());
        calculator.reset();
        System.out.println("Sum after reset: " + calculator.getSum());
    }
}