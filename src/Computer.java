public class Computer extends Player {

    public Computer(String token) {

        super("Bit Bucket", token);
    }


    public int[] determineMove(){
        int col = (int )(Math.random() * 8);

        int[] move =  {col};

        return move;

    }

}