package com.theironyard;

/**
 * Created by illladell on 5/23/16.
 */
public class ToDoItem {
    String text;
    boolean isDone;

    public ToDoItem(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
        //
    }
}


/* // String Formatting
String name = "Alice";
//String greeting = "Hello " + name + ", How are you?";
String greeting = String.format("Hello, %s. How are you? Money \$%.2f\n", name, 30.3233);
System.out.printf(greeting);
System.out.printf("Hello, %s. How are you?\n", name);
System.out.printf("Hello, %s. How are you?", name);
// variadic methods */