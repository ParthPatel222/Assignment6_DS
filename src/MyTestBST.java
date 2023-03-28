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
		do {
			System.out.println("\n0.Enter Tree Data Type (integer or string)\n" +
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
					 dataType = scan.next();
					 dataType = dataType.toLowerCase();
					//create new tree based on user data type
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
				case 1: if (tree == null) { //check if tree is created if not force user to use option 0
					System.out.println("Please create a tree first by entering option 0\n");
					break;
					}

					System.out.println("Testing method Insert Data Element(Option 1)\n");

					System.out.println("\nEnter Data Element to Insert: ");
					if(dataType.equals("integer")){ //uses dataType variable to determine which insert method to use
						int dataInt = scan.nextInt();
						System.out.print("BST before inserting "+ dataInt +" (Inorder):");
						tree.inorder();
						tree.insert(dataInt);
						System.out.print("\nBST after inserting "+ dataInt +" (Inorder):");
						tree.inorder();
					}
					else if(dataType.equals("string")){
						String dataString = scan.next();
						System.out.print("BST before inserting "+ dataString +" (Inorder):");
						tree.inorder();
						tree.insert(dataString);
						System.out.print("\nBST after inserting "+ dataString +" (Inorder):");
						tree.inorder();
					}
					else{
						System.out.println("Invalid Data Type\n");
					}
					break;
				case 2: if (tree == null) { //check if tree is created if not force user to use option 0
					System.out.println("Please create a tree first by entering option 0\n");
					break;
				}
					System.out.println("Testing method Delete Data Element(Option 2)\n");

					System.out.println("\nEnter Data Element to Delete: ");
					if(dataType.equals("integer")){ //uses dataType variable to determine which delete method to use
						int dataInt = scan.nextInt();
						System.out.print("BST before deleting "+ dataInt +" (Inorder):");
						tree.inorder();
						tree.delete(dataInt);
						System.out.print("\nBST after deleting "+ dataInt +" (Inorder):");
						tree.inorder();
					}
					else if(dataType.equals("string")){
						String dataString = scan.next();
						System.out.print("BST before deleting "+ dataString +" (Inorder):");
						tree.inorder();
						tree.delete(dataString);
						System.out.print("\nBST after deleting "+ dataString +" (Inorder):");
						tree.inorder();
					}
					else{
						System.out.println("Invalid Data Type\n");
					}
					break;
				case 3: if (tree == null) {
						System.out.println("Please create a tree first by entering option 0\n");
						break;
					}
					System.out.println("Testing method Search Data Element(Option 3)\n");

					System.out.println("\nEnter Data Element to Search: ");
					if(dataType.equals("integer")){
						int dataInt = scan.nextInt();
						System.out.print("Search for "+ dataInt +" ? " + tree.search(dataInt));
					}
					else if(dataType.equals("string")){
						String dataString = scan.next();
						System.out.print("Search for "+ dataString +" ? " + tree.search(dataString));
					}
					else{
						System.out.println("Invalid Data Type\n");
					}
					break;
				case 4: if (tree == null) {
						System.out.println("Please create a tree first by entering option 0\n");
						break;
					}
					System.out.println("Testing method Tree Size(Option 4)\n");
					System.out.print("Tree size: " + tree.getSize());
					break;
				case 5: if (tree == null) {
						System.out.println("Please create a tree first by entering option 0\n");
						break;
					}
					System.out.println("Testing method Path from Root to Data Element(Option 5)\n");

					System.out.println("\nEnter Data Element to Search: ");
					if(dataType.equals("integer")){
						int dataInt = scan.nextInt();
						java.util.ArrayList<BST.TreeNode<String>> path = tree.path(dataInt); //got this from TestBST.java
						System.out.print("Path from root to " + dataInt + " is: ");
						for (int i = 0; path != null && i < path.size(); i++)
							System.out.print(path.get(i).element + " ");

					}
					else if(dataType.equals("string")){
						String dataString = scan.next();
						java.util.ArrayList<BST.TreeNode<String>> path = tree.path(dataString);
						System.out.print("Path from root to " + dataString + " is: ");
						for (int i = 0; path != null && i < path.size(); i++)
							System.out.print(path.get(i).element + " ");
					}
					else{
						System.out.println("Invalid Data Type\n");
					}
					break;
				case 6: if (tree == null) {
						System.out.println("Please create a tree first by entering option 0\n");
						break;
					}
					System.out.println("Testing method Check if Empty Tree (Option 6)\n");
					System.out.print("Is empty tree? " + tree.isEmpty());
					break;
				case 7: if (tree == null) {
						System.out.println("Please create a tree first by entering option 0\n");
						break;
					}
					System.out.println("Testing method Inorder Traversal (Option 7)\n");
					System.out.print("Inorder: ");
					tree.inorder();
					break;
				case 8: if (tree == null) {
						System.out.println("Please create a tree first by entering option 0\n");
						break;
					}
					System.out.println("Testing method Postorder Traversal (Option 8)\n");
					System.out.print("Postorder: ");
					tree.postorder();
					break;
				case 9: if (tree == null) {
						System.out.println("Please create a tree first by entering option 0\n");
						break;
					}
					System.out.println("Testing method Preorder Traversal (Option 9)\n");
					System.out.print("Preorder: ");
					tree.preorder();
					break;
				case 10: System.out.println("Exiting Program");
					break;
				default: System.out.println("Invalid Option");
					break;
			}

		} while (choice != 10);
	}
}
