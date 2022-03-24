package com.company;

public class Customer
{
    private String name;
    private int balance;
    private int age;


    public Customer(String name, int age, int balance)
    {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }
    @Override
    public String toString()
    {
        String space = ": ";
        String s = this.name + space + this.age +space+ this.balance;
        return s;
    }

    public String getName()
    {
        return name;
    }
    public int getBalance()
    {
        return balance;
    }
    public int getAge()
    {
        return age;
    }

}
