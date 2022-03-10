package Task2;

public class Room
{
    private int Walls;
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int walls, int doors, int lamps, int windows)
    {
        this.Walls = walls;
        this.numberOfDoors = doors;
        this.numberOfLamps = lamps;
        this.numberOfWindows = windows;

    }

    public int getWalls()
    {
        return Walls;
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    public int getNumberOfLamps()
    {
        return numberOfLamps;
    }

    public int getNumberOfWindows()
    {
        return numberOfWindows;
    }
}
