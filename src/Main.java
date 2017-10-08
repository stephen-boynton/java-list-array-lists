import java.util.Scanner;

/**
 * Created by stephenboynton on 7/1/17.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main (String[] args) {

    boolean quit = false;
    int choice;
    printInstructions();
    while(!quit) {
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 0:
                printInstructions();
                break;
            case 1:
                groceryList.printList();
                break;
            case 2:
                addItem();
                break;
            case 3:
                modifyItem();
                break;
            case 4:
                removeItem();
                break;
            case 5:
                searchItem();
                break;
            case 6:
                quit = true;
                break;
        }
    }
    }

    public static void printInstructions() {
        System.out.println("\n Press");
        System.out.println("\t 0 - Print choice options.");
        System.out.println("\t 1 - Print grocery list items.");
        System.out.println("\t 2 - Add an item to the list.");
        System.out.println("\t 3 - Modify an item.");
        System.out.println("\t 4 - Remove an item.");
        System.out.println("\t 5 - Search for an item.");
        System.out.println("\t 6 - Quit the program.");
    }

    public static void addItem () {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyItems(itemNo - 1, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo - 1);
    }

    public static void searchItem() {
        System.out.println("Enter search: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItems(searchItem) != null) {
            System.out.println("Found " + searchItem + " in the grocery list.");
        } else {
            System.out.println(searchItem + " was not in the grocery list.");
        }
    }



}
