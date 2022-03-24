package com.company;

import java.util.Scanner;

public class Main
{
    static Bank bank;

    public static void main(String[] args) {

        //Setup af variabler og lister
        bank = new Bank("Lollandsbanken");

        bank.startDialog();

        System.out.println(bank.customers);
    }

}




