package com.company;

import javax.swing.undo.UndoableEdit;
import java.util.Scanner;

public class TextUI
{
    public String getUserInput(String msg) {

        //scanner instans og kald til nextLine
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        //Bank.customers.get(0).getName();
        return input;
    }
    public int showMenu()
    {
        System.out.println("Choose one of the following options:");
        System.out.println("1). Create User");
        System.out.println("2). Display all users");
        System.out.println("3). Exit Menu");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }
}
