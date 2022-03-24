package com.company;

import java.util.Optional;

public class Field {
    private String label;
    private String fieldType; // skal fjernes senere
    private int id;
    private int cost;
    private int income;
    //private int seriesID;
    //private Player owner;
    private String currentOption;

    public Field(int id, String label, String fieldType, int cost, int income) {
        this.id = id;
        this.label = label;
        this.fieldType = fieldType;
        this.cost = cost;
        this.income = income;

    }

    public String onLand(Player player) {
        String message = "Du er landet på " + this.toString() + "\n" ;

        switch (fieldType) {
            case "Plot":

                break;
            case "Chance":
                message += this.label;
                break;
            case "Start":
                message += "Tag startbeløb";
                break;
            case "Tax":
                message += "Betal skat";
                break;
            case "ShippingLine":
                message += "Shippingline";
                break;
            case "Parking":
                message += "Parker her gratis i en runde";
                break;
            case "Brewery":
                message += "Brewery";
                break;
            case "Prison":
                message += "Gå i fængsel";
                break;
        }
        return message;
    }

    public String processResponse (Player player, String response)
    {
        String message = "";
        if (response.equalsIgnoreCase("Y")) {
            message = this.onAccept(player);
        } else {
            message = this.onReject(player);
        }
        return message;
    }

    private String onAccept(Player player) {
        String message = "";
        if (this.currentOption.equals("buy")) {
            message = (player.getName() + " decided to buy");
            Property.owner = player;
            player.buyProperty(cost,id);
        }
        return message;
    }

    private String onReject(Player player)
    {
        String message = "";
        if (this.currentOption.equals("buy"))
        {
            message = (player.getName() + " decided NOT to buy");
        }
        return message;
    }

    @Override
    public String toString() {
        return id + " " + label;
    }

}