public class ThreadPrinting {
    public static void main(String[] args) {
        NumberPrinter evenPrinter = new NumberPrinter(2, 20);
        NumberPrinter oddPrinter = new NumberPrinter(1, 19);

        Thread evenThread = new Thread(evenPrinter);
        Thread oddThread = new Thread(oddPrinter);

        evenThread.start();
        try {
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        oddThread.start();
    }
}