// Name: <Parth Patel>
// Class: CS 3305/Section 01
// Term: Spring 2023
// Instructor: Dr. Haddad
// Assignment: 6
// IDE Name: <IntelliJ>

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int choice;
		BST tree = null;
		String line = "";

		do {
			System.out.println("\n1. Read input string\n" +
					"2. Remove duplicates and display outputs\n" +
					"3. Exit Program\n");
			System.out.println("Enter your choice: ");
			choice = scan.nextInt();

			switch (choice){
				case 1:
					System.out.println("Enter a string: ");

				line = sc.nextLine();

					String[] elements = line.split(" ");
					tree = new BST<String>(elements);

					break;

				case 2: System.out.println("Original text: " + line);
					System.out.print("Processed text: ");
					tree.inorder();
					System.out.println("\n");
					break;
				case 3: System.out.println("Exiting Program");
					break;
				default: System.out.println("Invalid Choice");
					break;
			}
		} while (choice != 3);

	}
}
