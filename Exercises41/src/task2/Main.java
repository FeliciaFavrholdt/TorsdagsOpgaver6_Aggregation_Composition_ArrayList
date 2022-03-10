package task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 2.g Instantiate at least three different rooms
        Room roomOne = new Room(4,5,5,6);
        Room roomTwo = new Room(5,6,7,8);
        Room roomThree = new Room(1,1,1,1);
        Room roomFour = new Room(2,4,67,4);
        Room roomFive = new Room(2345,6,7,44);

        //test output of rooms
        System.out.println("Number of lamps: " + roomOne.getNumberOfLamps());
        System.out.println("Number of doors: " + roomTwo.getNumberOfDoors());
        System.out.println("Number of windows: " + roomThree.getNumberOfWindows());
        System.out.println(roomFour);
        System.out.println(roomFive);

        //2.h Add rooms to a collection
        ArrayList<Room> allRooms = new ArrayList<>();
        allRooms.add(roomOne);
        allRooms.add(roomTwo);
        allRooms.add(roomThree);
        allRooms.add(roomFour);
        allRooms.add(roomFive);

        //2.i Instantiate a new building
        Building buildingOne = new Building(allRooms,1, 200,true);

        //2.j print the total number of lamps in the entire building
        int sum = 0;
        for (Room r : buildingOne.getRooms()) { //all rooms in building
            sum += r.getNumberOfLamps();
        }
        System.out.println("This is the total number of lamps in the building: " + sum);

        //2.k check if numberOfFloors > number of Rooms. if true, then print "This is an odd building"
        if (buildingOne.getNumberOfFloors() > buildingOne.getRooms().size()) {
            System.out.println("This is an odd building.. ");
        }
    }
}