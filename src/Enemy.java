public class Enemy implements Creature{
    private int health;

    @Override
    public int getHealth() {return health;}

    @Override
    public void takeDamage(int dmg) {
        health-=dmg;
    }
}
