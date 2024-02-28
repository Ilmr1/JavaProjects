public class TestThread extends Thread {
    private ThreadSafeArrayList list;

    public TestThread(ThreadSafeArrayList list) {
        this.list = list;
    }

    @Override
    public void run() {
        list.add(Thread.currentThread().getName());
        System.out.println("Added element. Size: " + list.size());
        list.remove(0);
        System.out.println("Removed element. Size: " + list.size());
    }
}