

import java.util.Scanner;
public class Main{
    private static Scanner input;
    private static final ObjectManagement ObjManger = new ObjectManagement();

    private static boolean isMenu;
    private static boolean isPlaying;
    private static Player player;

    public static void main(String[] args) {

        isPlaying = true;
        isMenu=false;
        input = new Scanner(System.in);

        while(isPlaying){
            switch(PromptPlayer("Type 'New','Play', 'menu' ", new String[]{"Play","menu","New"})){
                case "Play":
                    player = new Player();
                    player= ObjManger.loadPlayer();

                    System.out.printf("You have %s hp \n",player.getHealth());
                    player.takeDamage(15);
                    System.out.printf("You have %s hp \n",player.getHealth());
                    //player.getFloor().playFloor(player);
                    break;

                case "menu":
                    isMenu= true;
                    Menu();
                    break;

                case "New":
                    player = new Player();
                    ObjManger.savePlayer(player);
                    break;

                default:

            }

        }
        String further_programming="Hello";
        System.out.println(further_programming);
    }
    private static <T,E> E PromptPlayer(String prompt, E[] arrOfValid){

        System.out.println(prompt);
        while(true) {
            String UserInput = input.next();
            for (E validAns : arrOfValid) {
                if (UserInput.equals(validAns)) {
                    return validAns;
                }
            }

            System.out.println("Invalid input, please try again");
        }
    }
    private <T,E> E PromptPlayer(String prompt, T variableType){
        E answer;

        answer= (E) input.nextLine();

        return answer;
    }
    public static void Menu(){
        while (isMenu && isPlaying) {
            switch(PromptPlayer("Type 'Return'. or 'Exit' or 'save' ", new String[]{"Return","Exit","save"})){
                case "Return":
                    isMenu=false;
                    break;
                case "Exit":
                    isPlaying = false;
                    break;

                case "save":
                    ObjManger.savePlayer(player);
                    break;
            }
        }
    }



}
