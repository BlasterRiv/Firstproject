import java.io.*;

public class Player implements Creature, Serializable {
    private int health=100;
    private Floor curFloor;



    public Floor getFloor(){return curFloor;}
    public int getHealth() {return health;}

    @Override
    public void takeDamage(int dmg) {
        health-=dmg;
    }

}
