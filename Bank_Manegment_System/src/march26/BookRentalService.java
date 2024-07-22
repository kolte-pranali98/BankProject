package march26;

import java.util.Scanner;

public class BookRentalService {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDays = 0;

        while (true) {
            System.out.println("\nBook Rental Service");
            System.out.println("1. Enter Number of Days");
            System.out.println("2. Calculate Rental Fee");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of days you wish to rent the book: ");
                    numDays = scanner.nextInt();
                    break;
                case 2:
                    if (numDays == 0) {
                        System.out.println("Please enter the number of days first.");
                    } else {
                        double rentalFee;
                        if (numDays <= 7) {
                            rentalFee = numDays * 2;
                        } else {
                            rentalFee = numDays * 1.5;
                        }
                        System.out.println("The rental fee for " + numDays + " days is " + rentalFee + " rupees.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}

