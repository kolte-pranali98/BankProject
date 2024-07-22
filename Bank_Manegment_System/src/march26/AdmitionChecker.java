package march26;

import java.util.Scanner;

public class AdmitionChecker {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] grades = new int[5]; 

	        int choice;
	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Enter Grades");
	            System.out.println("2. Check Eligibility");
	            System.out.println("3. Exit Program");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    enterGrades(scanner, grades);
	                    break;
	                case 2:
	                    checkEligibility(grades);
	                    break;
	                case 3:
	                    System.out.println("Exiting program...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        } while (choice != 3);

	        scanner.close();
	    }

	    public static void enterGrades(Scanner scanner, int[] grades) {
	        System.out.println("Enter grades for 5 subjects:");

	        for (int i = 0; i < grades.length; i++) {
	            System.out.print("Enter grade for subject " + (i + 1) + ": ");
	            grades[i] = scanner.nextInt();
	        }

	        System.out.println("Grades entered successfully.");
	    }

	    public static void checkEligibility(int[] grades) {
	        int total = 0;
	        for (int grade : grades) {
	            total += grade;
	        }

	        double average = (double) total / grades.length;

	        if (average > 80) {
	            System.out.println("Student is ELIGIBLE for admission.");
	        } else {
	            System.out.println("Student is NOT ELIGIBLE for admission.");
	        }
	    }
	}
