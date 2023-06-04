
package org.BrennanProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroceryList {

    private int numberOfItems;
    private Map<String,String> itemsAndDepartment = new HashMap<>();
    private String newItem;
    private String newItemDepartment;
    private Map<String,String> databaseOfItemsAndDepartment = new HashMap<>();
    //TODO Create database for items to retain for future use
    //TODO keep aisle number for each item in database
    //TODO map out best route based on aisle number

    public GroceryList(String newItem) {
        this.newItem = newItem;
    }

    public GroceryList(String newItem, String newItemDepartment) {
        this.newItem = newItem;
        this.newItemDepartment = newItemDepartment;
    }
    public int getNumberOfItems(){
        this.numberOfItems = itemsAndDepartment.size();
        return this.numberOfItems;
    }

    public Map<String, String> getItemsAndDepartment() {
        return itemsAndDepartment;
    }

    public void setNewItem(String newItem) {
        this.newItem = newItem;
    }

    public void setNewItemDepartment(String newItemDepartment) {
        this.newItemDepartment = newItemDepartment;
    }
    public boolean checkItemToDatabase(){
        if (databaseOfItemsAndDepartment != null){
            return databaseOfItemsAndDepartment.containsKey(this.newItem);
        }else return true;
    }
    public void addItemKeyAndDepartmentValue (){
        this.itemsAndDepartment.put(this.newItem,this.newItemDepartment);
        this.databaseOfItemsAndDepartment.put(this.newItem, this.newItemDepartment);
    }
    public void addItemWithKnownDepartment(){
        this.itemsAndDepartment.put(this.newItem, databaseOfItemsAndDepartment.get(this.newItem));
    }

}
