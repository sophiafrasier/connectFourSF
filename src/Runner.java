import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {


        Board b = new Board();
        Human h = new Human("Alby", "X");
        Computer c = new Computer("0");
        Scanner sc =  new Scanner(System.in);


        while(!h.checkWin() && !c.checkWin()) {


            boolean legalCol = false;

            int moveCol = -1;


            while(!legalCol) {


                System.out.println("Enter a column to move:");
                if(sc.hasNextInt()) {
                    moveCol = sc.nextInt();
                    legalCol = true;
                }
                else {
                    System.out.println("Enter a legal col!");
                    sc.next();
                }

                if(legalCol) {
                    b.makeMove(moveCol,h.token);
                }
            }


            int cMove = c.determineMove();
            b.makeMove(cMove,c.token);

            //h.display();
            //c.display();

        }

        System.out.print("Game Over!");

    }

}