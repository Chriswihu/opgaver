package com.company;

import java.util.ArrayList;

public class Game
{
    ArrayList<Player> players = new ArrayList<>();
    FileIO fileIO = new FileIO();

    public Game()
    {
        /*Player player1 = new Player("Egon", 1200);
        Player player2 = new Player("Kjell", 300);
        Player player3 = new Player("Benny", 900);
        players.add(player1);
        players.add(player2);
        players.add(player3);*/

        ArrayList<String> data = new ArrayList<>();
        data = fileIO.readGameData();
        for(String s: data)
        {
            System.out.println(s);
            String[] values = s.split( ": ");
        }


    }

    boolean hasGameData()
    {

        return false;
    }

    void runLoop()
    {


    }

    void takeTurn()
    {


    }

    void printAccount()
    {


    }

    void saveGameData()
    {


    }

}
