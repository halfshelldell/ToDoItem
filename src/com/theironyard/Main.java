package com.theironyard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create a class to represent multiple things
        ArrayList<ToDoItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1: Create new item");
            System.out.println("2: Toggle item");
            System.out.println("3: List items");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    // create new item
                    System.out.println("Enter your item");
                    String text = scanner.nextLine();
                    ToDoItem item = new ToDoItem(text, false);
                    items.add(item);
                    break;

                case "2":
                    // toggle item
                    System.out.println("Enter the number of the item you wish to toggle:");
                    String numStr = scanner.nextLine();
                    int num = Integer.valueOf(numStr);
                    ToDoItem tempItem = items.get(num - 1);
                    tempItem.isDone = !tempItem.isDone;
                    break;


                case "3":
                    // list item
                    int i = 1;
                    for (ToDoItem toDoItem : items) {
                        String checkBox = "[ ]";
                        if (toDoItem.isDone) {
                            checkBox = "[x]";
                        }
                        System.out.println(checkBox + " " + i + " . " + toDoItem.text);
                        i++;
                        // or i += 1;
                    }
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
