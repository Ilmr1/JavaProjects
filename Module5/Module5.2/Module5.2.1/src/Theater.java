public class Theater {
    private int availableSeats;

    public Theater(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized boolean reserveSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        }
        return false;
    }
}

