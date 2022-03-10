package task2;

public class Room {
    //2.a create fields
    private static int walls;
    private static int numberOfDoors;
    private static int numberOfLamps;
    private static int numberOfWindows;

    //2.b - create a constructor for class Room
    public Room(int walls, int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.walls = walls;
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    //2.c Create getters() for each of the fields above
    public int getWalls() {
        return walls;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

}
