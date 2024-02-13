import java.io.*;

public class ObjectManagement{
    private FileOutputStream fileOut;
    private ObjectOutputStream objectOut;
    private FileInputStream fileIn;
    private ObjectInputStream objectIn;


    public void savePlayer(Player obj){
        try {
            fileOut = new FileOutputStream("src\\ToSave\\PlayerSave.ser");
            objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(obj);
            objectOut.close();
            fileOut.close();

            System.out.println("Saved");
        }
        catch (IOException e){
            System.out.println("Failed save "+e);
        }
    }
    public Player loadPlayer(){
        Player player;
        try {
            fileIn = new FileInputStream("src\\ToSave\\PlayerSave.ser");
            objectIn = new ObjectInputStream(fileIn);
            player = (Player) objectIn.readObject();

            objectIn.close();
            fileIn.close();

            System.out.println("loaded");
            return player;
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println("Failed load, will make new PLayer \n Error:  "+e);
        }

        return player=new Player();
    }
}
