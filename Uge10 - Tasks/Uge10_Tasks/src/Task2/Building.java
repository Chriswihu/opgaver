package Task2;

public class Building
{
    //final int Rooms = 5;
    private int Rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(int rooms, int bathrooms, int floors, boolean office)
    {
        this.Rooms = rooms;
        this.numberOfBathrooms = bathrooms;
        this.numberOfFloors = floors;
        this.isOfficeBuilding = office;
    }

    public int getRooms() {
        return Rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}
