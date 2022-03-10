package Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static ArrayList<Room> rooms = new ArrayList<>();
    public static void main(String[] args)
    {
        Room room1 = new Room(4, 1, 3, 2);
        Room room2 = new Room(4, 2, 5, 3);
        Room room3 = new Room(4, 5, 8, 6);

        Building building = new Building(3, 2, 7,false);
        System.out.println(room1.getNumberOfLamps() + room2.getNumberOfLamps() + room3.getNumberOfLamps());

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        System.out.println(Arrays.deepToString(new ArrayList[]{rooms}));

        if(building.getNumberOfFloors() > building.getRooms())
        {
            System.out.println("This is an odd Building!");
        }
    }


}
