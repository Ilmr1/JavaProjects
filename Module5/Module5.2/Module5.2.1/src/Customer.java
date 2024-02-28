public class Customer extends Thread {
    private Theater theater;

    public Customer(Theater theater) {
        this.theater = theater;
    }
    @Override
    public void run() {
        if (theater.reserveSeat()) {
            System.out.println("Seat reserved by " + Thread.currentThread().getName());
        } else {
            System.out.println("Reservation failed for " + Thread.currentThread().getName());
        }
    }
}
