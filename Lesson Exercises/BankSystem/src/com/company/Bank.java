package com.company;

import java.util.ArrayList;

public class Bank
{
    private String name;
    private String city = "København";
    private int employeeNum = 400;
    ArrayList<Customer> customers = new ArrayList<>();
    TextUI textUI;

    public Bank(String name)
    {
        this.name = name;
        textUI = new TextUI();
    }
    public void startDialog()

    {
        int choice = 0;
        while(choice != 3)
        {
            choice = textUI.showMenu();
            doAction(choice);
        }
    }

    public void displayCostumers()
    {
        for(Customer c: customers)
        {
            System.out.println("Customer name: " + c.getName() + "\n" + "Customer age: " + c.getAge() + "\n" + "Customer Balance" + c.getBalance());
        }
    }

    private void doAction(int choice)
    {
        switch (choice)
        {
            case 1:
                System.out.println("You have Chosen Create user");
                this.regsistorCostumer();

                break;

            case 2:
                this.displayCostumers();

                break;

            case 3:
                System.out.println("You have closed the Menu");

                break;
        }
    }

    public void regsistorCostumer()
    {
        String name = textUI.getUserInput("Tast Kundens navn: ");
        int age = Integer.parseInt(textUI.getUserInput("Tast Kundens Alder: "));
        int balance = Integer.parseInt(textUI.getUserInput("Tast kundens Konto Balance: "));
        addCustomer(name, age, balance);

    }

    @Override
    public String toString()
    {
        String space = "\n";
        String s = this.name + space + this.city +space+ this.employeeNum;
        return s;
    }

    public void addCustomer(String name, int age, int balance)
    {

        Customer c = new Customer(name, age, balance);

        customers.add(c);

    }



}
