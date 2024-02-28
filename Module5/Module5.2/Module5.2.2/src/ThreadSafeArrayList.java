import java.util.ArrayList;

public class ThreadSafeArrayList {
    private ArrayList<String> list = new ArrayList<>();

    public synchronized void add(String s) {
        list.add(s);
    }

    public synchronized String remove(int index) {
        if (index < list.size()) {
            return list.remove(index);
        }
        return null;
    }

    public synchronized int size() {
        return list.size();
    }
}