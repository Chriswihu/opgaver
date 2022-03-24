package com.company;

public class Player
{
    private BankAccount account;
    private String name;
    private int currentPosition = 1;


    public Player(String name,int balance)
    {
        this.name = name;
        this.account = new BankAccount(balance);

    }
    public String getName()
    {
        return name;
    }

    public int getBalance()
    {
        return account.getBalance();
    }

    @Override
    public String toString()
    {
        return name + " : " + account.getBalance();

    }

    public int getCurrentPosition(){
        return currentPosition;
    }

    public int updatePosition(int roll)
    {
        currentPosition += roll;
        if(currentPosition > 40)
        {
            currentPosition -= 40;
        }
        return currentPosition;
    }

    public void buyProperty(int amount, int id)
    {
        this.account.doTransaction(-amount);
    }



}

