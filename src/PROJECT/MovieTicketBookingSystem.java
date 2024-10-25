import java.util.Scanner;

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        String movieName;
        int numTickets;
        int totalPrice = 0;
        boolean isBooked = false;
        String seatType;
        int seatRow;
        int seatColumn;
        int availableSeats[][] = {
            {10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10}
        };

        // Display movie options
        System.out.println("Select a movie:");
        System.out.println("1. Avengers: Endgame");
        System.out.println("2. The Lion King");
        System.out.println("3. Frozen 2");
        System.out.print("Enter your choice (1/2/3): ");
        int movieChoice = scanner.nextInt();

        // Get movie name based on user choice
        if (movieChoice == 1) {
            movieName = "Avengers: Endgame";
        } else if (movieChoice == 2) {
            movieName = "The Lion King";
        } else if (movieChoice == 3) {
            movieName = "Frozen 2";
        } else {
            System.out.println("Invalid choice. Please try again.");
            scanner.close();
            return; 
        }

        // Get number of tickets
        System.out.print("Enter the number of tickets: ");
        numTickets = scanner.nextInt();

        // Calculate total price based on movie and number of tickets
        if (movieName.equals("Avengers: Endgame")) {
            totalPrice = numTickets * 25000;
        } else if (movieName.equals("The Lion King")) {
            totalPrice = numTickets * 20000;
        } else if (movieName.equals("Frozen 2")) {
            totalPrice = numTickets * 15000;
        }

        // Display seat options
        System.out.println("Select a seat type:");
        System.out.println("1. VIP (Rp 50000 per ticket)");
        System.out.println("2. Premium (Rp 30000 per ticket)");
        System.out.println("3. Regular (Rp 20000 per ticket)");
        System.out.print("Enter your choice (1/2/3): ");
        int seatTypeChoice = scanner.nextInt();

        if (seatTypeChoice == 1) {
            seatType = "VIP";
            totalPrice += numTickets * 50000;
        } else if (seatTypeChoice == 2) {
            seatType = "Premium";
            totalPrice += numTickets * 30000;
        } else if (seatTypeChoice == 3) {
            seatType = "Regular";
            totalPrice += numTickets * 20000;
        } else {
            System.out.println("Invalid choice. Please try again.");
            scanner.close();
            return;
            
        }

        // Display seat layout
        System.out.println("Select a seat location:");
        System.out.println("  A  |  B  |  C  |  D  |  E");
        System.out.println("  ---|----|----|----|----");
        System.out.println("1 | " + availableSeats[0][0] + " | " + availableSeats[0][1] + " | " + availableSeats[0][2] + " | " + availableSeats[0][3] + " | " + availableSeats[0][4]);
        System.out.println("2 | " + availableSeats[1][0] + " | " + availableSeats[1][1] + " | " + availableSeats[1][2] + " | " + availableSeats[1][3] + " | " + availableSeats[1][4]);
        System.out.println("3 | " + availableSeats[2][0] + " | " + availableSeats[2][1] + " | " + availableSeats[2][2] + " | " + availableSeats[2][3] + " | " + availableSeats[2][4]);

        System.out.print("Enter the seat row (1-3): ");
        seatRow = scanner.nextInt();
        System.out.print("Enter the seat column (A-E): ");
        char seatColumnChar = scanner.next().charAt(0);
        seatColumn = seatColumnChar - 'A' + 1;

        // Check if the seat is available
if (seatRow >= 1 && seatRow <= 3 && seatColumn >= 0 && seatColumn <= 4) {
    if (availableSeats[movieChoice - 1][seatColumn] >= numTickets) {
        availableSeats[movieChoice - 1][seatColumn] -= numTickets;
        isBooked = true;
        System.out.println("Seat booked successfully!");
    } else {
        System.out.println("Sorry, the seat is not available. Please try again.");
    }
    } else {
    System.out.println("Invalid seat selection. Please try again.");
    scanner.close();
    return;
}
        // Display booking details
        System.out.println("Movie: " + movieName);
        System.out.println("Number of tickets: " + numTickets);
        System.out.println("Seat type: " + seatType);
        System.out.println("Seat location: Row " + seatRow + ", Column " + seatColumnChar);
        System.out.println("Total price: Rp " + totalPrice);

        // Ask for confirmation
        System.out.print("Do you want to book the tickets? (yes/no): ");
        String confirmation = scanner.next();

        if (confirmation.equalsIgnoreCase("yes")) {
            isBooked = true;
            System.out.println("Tickets booked successfully!");
        } else {
            System.out.println("Booking cancelled.");
        }
        
        System.out.println("==========NOTA PEMBELIAN========");
        System.out.println("Movie: " + movieName);
        System.out.println("Number of tickets: " + numTickets);
        System.out.println("Seat type: " + seatType);
        System.out.println("Seat location: Row " + seatRow + ", Column " + seatColumnChar);
        System.out.println("Total price: Rp " + totalPrice);
        System.out.println("TERIMA KASIH");
        scanner.close();
    }
}