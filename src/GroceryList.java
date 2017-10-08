import java.util.ArrayList;

/**
 * Created by stephenboynton on 7/1/17.
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem (String item) {
        groceryList.add(item);
    }

    public void printList () {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i +1) + " " + groceryList.get(i));
        }
    }

    public void modifyItems (String newItem) {
        int position = findItems(newItem);
        if (position >= 0) {
            modifyItems(position, newItem);
        }
    }

    private void modifyItems (int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("You have modified the grocery list.");
    }

    public void removeGroceryItem (String item) {
        int position = findItems(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem (int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public int findItems (String searchItem) {
        return groceryList.indexOf(searchItem);
    }


}
