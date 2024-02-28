public class Main {
    public static void main(String[] args) {
        ThreadSafeArrayList list = new ThreadSafeArrayList();

        for (int i = 0; i < 10; i++) {
            new TestThread(list).start();
        }
    }
}