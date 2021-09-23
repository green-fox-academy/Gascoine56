package Reservations;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Reservation res = new Reservation();
            System.out.println("Booking# " + res.getCodeBooking() + " for " + res.getDowBooking());
        }
    }
}
