package org.BrennanProject;

import java.util.Scanner;

public class Main {
    private static GroceryList groceryList;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input = "";
        groceryList = new GroceryList(input);

        while (true) {
            System.out.println("When you are done adding items type \"Done!\"");
            System.out.println("Please input the item you would like to add to you Grocery List:");
            input = userInput.nextLine();
            if (input.equals("Done!")){
                break;
            }else{
                addingItem(input);
            }
        }
        System.out.println(groceryList.getItemsAndDepartment());
    }


    static void addingItem(String input){
        groceryList.setNewItem(input);
        if (groceryList.checkItemToDatabase()){
            groceryList.addItemWithKnownDepartment();
        }else {
            System.out.println("There is no department associated with this item. Please input department:");
            Scanner userInput = new Scanner(System.in);
            String departmentInput = userInput.nextLine();
            groceryList.setNewItemDepartment(departmentInput);
            groceryList.addItemKeyAndDepartmentValue();
        }
    }
}