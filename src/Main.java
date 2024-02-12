import java.util.Scanner;
public class Main{
    private static boolean isMenu;
    private static boolean isPlaying;
    private static Scanner input;

    public static void main(String[] args) {

        isPlaying = true;
        isMenu=false;
        input = new Scanner(System.in);

        while(isPlaying){
            while (isMenu && isPlaying) {
                System.out.println("please type Exit");
                isPlaying = !(input.next().equals("Exit"));
            }

            switch(PromptPlayer("Type 'Play'. or 'menu' ", new String[]{"Play","menu"})){
                case "Play":
                    Player player = new Player();
                    player.getFloor().playFloor();
                    break;

                case "menu":
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



}
