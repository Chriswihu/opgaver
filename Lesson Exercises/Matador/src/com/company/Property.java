package com.company;


public class Property extends Field {
    private int seriesID;
    private Player owner;

    public property(int id, String label, String fieldType, int cost, int income, int seriesID) {
        super(id, label, fieldType, cost, income, seriesID);

        this.seriesID = seriesID;
    }

    public String onLand(Player player)
    {
        String message = "";

        if (owner == null) {
            currentOption = "buy";
            message += "Vil du købe? Y for ja, N for nej";
        } else if (owner == player) {
            currentOption = "build"; //Currentoption build
            message += "Du ejer denne grund, vil du opgradere dit grund? Y for ja, N for nej";
        } else {
            currentOption = "payRent"; //Currentoption payRent
            message += "Betal husleje";
        }
        return message;
    }
}
