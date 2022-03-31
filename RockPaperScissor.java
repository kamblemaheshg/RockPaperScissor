import java.util.*;

public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println(" 0 for Paper - 1 for Rock - 2 for Scissor ");
        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();
        sc.close();
        Random rd = new Random();
        int computer = rd.nextInt(3);
        if (player > 2) {
            System.out.println("Entered Wrong Number Please Check !");
        } else {
            
            System.out.println("Your Choice : " + player);
            System.out.println("Computer Choice : " + computer);

            if (player == computer) {
                System.out.println("Draw");
            } else if (player == 1 && computer == 2 || player == 2 && computer == 0 || player == 0 && computer == 1) {
                System.out.println("Win !");
            } else {
                System.out.println("loose !");
            }

        }
    }
}
