package com.company;

import java.util.ArrayList;

public class Game
{
    ArrayList<Player> players = new ArrayList<>();
    private FileIO fileIO = new FileIO();
    private TextUI textUI = new TextUI();
    private Dice dice = new Dice();
    private Player currentPlayer;
    Board board;


    public Game() {
        ArrayList<String> data = new ArrayList<>();
        data = fileIO.readGameData();
        // på hver plads i data står der et navn og en saldo fx. "Tobias: 30000"
        if (data == null) {
            System.out.println("No Data, request Data from User(s).");
            data = textUI.getPlayerNames("Write Playername(s) and type Q to quit.");
        }
        this.createPlayers(data);

        String[] fieldData = fileIO.readFieldData();
        board = new Board(fieldData);

        this.currentPlayer = this.players.get(0);

        takeTurn();

    }

    public void takeTurn()
    {
        int value = dice.rollDiceSum();
        textUI.displayMessage(this.currentPlayer.getName() + " slog " + value);
        int position = currentPlayer.updatePosition(value);
        Field f = board.getField(position);
        String decisionRequest = f.onLand(currentPlayer);

        String response = textUI.getUserInput(decisionRequest);
        String processedResponse = f.processResponse(currentPlayer, response);
        System.out.println(processedResponse);

    }


    private void createPlayers(ArrayList<String> data)
    {
        for(String s : data)
        {
            //System.out.println(s);
            String[] values = s.split( ": "); //Splits array determined by regex.
            int balance;

            if(values.length>1)
            {
                balance = Integer.parseInt(values[1]);
            }
            else
            {
                balance = Integer.parseInt("30000");
            }
            Player p = new Player(values[0], balance);
            players.add(p);
        }

    }
    public String getPlayers(){
        return this.players.toString();
    }


}
