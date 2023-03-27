// Name: <Parth Patel>
// Class: CS 3305/Section 01
// Term: Spring 2023
// Instructor: Dr. Haddad
// Assignment: 6
// IDE Name: <IntelliJ>

import java.util.Scanner;

public class MyTestBST {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int choice;
		BST tree = null;
		String dataType = "";
		int data = 0;
		String dataString = null;
		do {
			System.out.println("0.Enter Tree Data Type (integer or string)\n" +
					"1. Insert Data Element\n" +
					"2. Delete Data Element\n" +
					"3. Search Data Element\n" +
					"4. Print Tree\n" +
					"5. Path from Root to Data Element\n" +
					"6. Check if Empty Tree\n" +
					"7.Print Preorder Traversal\n" +
					"8.Print Inorder Traversal\n" +
					"9.Print Postorder Traversal\n" +
					"10. Exit Program\n");
			System.out.println("Enter your choice(Start with 0. if this is a new tree): ");
			choice = scan.nextInt();

			switch (choice){
				case 0: System.out.println("Enter Tree Data Type (integer or string): ");
					//allow user to enter data type of tree (integer or string)
					 dataType = scan.next();
					//create new tree based on user input
					if(dataType.equals("integer")){
						 tree = new BST<Integer>();
					}
					else if(dataType.equals("string")){
						 tree = new BST<String>();
					}
					else{
						System.out.println("Invalid Data Type\n");
					}
					break;
				case 1: System.out.println("Testing method Insert Data Element\n");
					System.out.println("\nEnter Data Element to Insert: ");
					if(dataType.equals("integer")){
						//tree.insert(scan.nextInt());
						data = scan.nextInt();
						tree.insert(data);
					}
					else if(dataType.equals("string")){
						//tree.insert(scan.next());
						dataString = scan.next();
						tree.insert(dataString);
					}
					else{
						System.out.println("Invalid Data Type\n");
					}
					System.out.print("BST before inserting " + data + "(Inorder): ");
					tree.inorder();
					break;
			}

		} while (choice != 10);
	}
}
