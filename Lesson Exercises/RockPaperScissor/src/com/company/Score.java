package com.company;

public class Score
{
    private int gamesWonByUser;
    private int totalNumberGames;

    public void incrementGamesWonByUser()
    {
        gamesWonByUser++;
    }

    public void incrementTotalNumber()
    {
        totalNumberGames++;
    }

    public int totalNumberGames()
    {
        return totalNumberGames;
    }

    public int getGamesWonByUser()
    {
        return gamesWonByUser;
    }

}
