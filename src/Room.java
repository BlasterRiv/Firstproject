import java.util.ArrayList;

public class Room {


    private boolean isLocked;

    private boolean isNorthRoom;
    private boolean isEastRoom;
    private boolean isSouthRoom;
    private boolean isWestRoom;


    private ArrayList<Enemy> ListOfEnemy = new ArrayList<Enemy>();
    private int numOfThreats;
    private boolean isCleared;
}
