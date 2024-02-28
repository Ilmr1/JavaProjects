public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater(10);
        for (int i = 0; i < 15; i++) {
            new Customer(theater).start();
        }
    }
}

