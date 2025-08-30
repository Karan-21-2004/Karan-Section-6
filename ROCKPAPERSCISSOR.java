import java.util.Scanner;
import java.util.Random;

public class ROCKPAPERSCISSOR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        String playagain;
        String[] Choices = {"rock","paper","scissor"};
        do {
            System.out.println("CHOOSE FROM ROCK,PAPER,SCISSORS : ");
            String choice = sc.nextLine().toLowerCase();

            String cchoice = Choices[rd.nextInt(3)];
            System.out.println("Computer's choice : " + cchoice);

            if (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissor")) {
                System.out.println("INVALID CHOICE");
            }
                if (choice.equals(cchoice)) {
                    System.out.println("IT IS A TIE");
                } else if (choice.equals("paper") && cchoice.equals("rock") ||
                        choice.equals("scissor") && cchoice.equals("paper") ||
                        choice.equals("rock") && cchoice.equals("scissor")) {
                    System.out.println("YOU ARE THE WINNER");
                } else {
                    System.out.println("YOU LOOOOOOSSSSSSSSEEEEEE");
                }
            System.out.println("WANNA PLAY AGAIN(yes/no) ? ");
            playagain = sc.nextLine().toLowerCase();
        }while(playagain.equals("yes"));
        System.out.println("THANKS FOR PLAYING");
    }
}
