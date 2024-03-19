import java.util.Scanner;

	public class SeatReservationSystem {
	    private boolean[] seats; // Array to track seat occupancy

	    // Constructor to initialize seats array
	    public SeatReservationSystem(int numSeats) {
	        seats = new boolean[numSeats]; // Initialize all seats as unoccupied
	    }

	    // Method to display the status of all seats
	    public void displaySeatStatus() {
	        System.out.println("Seat Status:");
	        for (int i = 0; i < seats.length; i++) {
	            System.out.println("Seat " + (i + 1) + ": " + (seats[i] ? "Occupied" : "Unoccupied"));
	        }
	    }

	    // Method to reserve a seat
	    public void reserveSeat(int seatNumber) {
	        if (seatNumber < 1 || seatNumber > seats.length) {
	            System.out.println("Invalid seat number. Please enter a valid seat number.");
	            return;
	        }
	        if (seats[seatNumber - 1]) {
	            System.out.println("Seat " + seatNumber + " is already occupied. Please choose another seat.");
	        } else {
	            seats[seatNumber - 1] = true;
	            System.out.println("Seat " + seatNumber + " reserved successfully.");
	        }
	    }

	    // Method to cancel a reservation
	    public void cancelReservation(int seatNumber) {
	        if (seatNumber < 1 || seatNumber > seats.length) {
	            System.out.println("Invalid seat number. Please enter a valid seat number.");
	            return;
	        }
	        if (!seats[seatNumber - 1]) {
	            System.out.println("Seat " + seatNumber + " is not occupied. No reservation to cancel.");
	        } else {
	            seats[seatNumber - 1] = false;
	            System.out.println("Reservation for seat " + seatNumber + " canceled successfully.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the Number of seats available:");
	        int size=scanner.nextInt();

	        // Initialize seat reservation system with 10 seats
	        SeatReservationSystem reservationSystem = new SeatReservationSystem(size);

	        while (true) {
	            System.out.println("\n1. Display Seat Status");
	            System.out.println("2. Reserve a Seat");
	            System.out.println("3. Cancel Reservation");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    reservationSystem.displaySeatStatus();
	                    break;
	                case 2:
	                    System.out.print("Enter seat number to reserve: ");
	                    int reserveSeatNumber = scanner.nextInt();
	                    reservationSystem.reserveSeat(reserveSeatNumber);
	                    break;
	                case 3:
	                    System.out.print("Enter seat number to cancel reservation: ");
	                    int cancelSeatNumber = scanner.nextInt();
	                    reservationSystem.cancelReservation(cancelSeatNumber);
	                    break;
	                case 4:
	                    System.out.println("Exiting program. Goodbye!");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
	            }
	        }
	    }
	}


