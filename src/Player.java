public class Player {
    protected Board b = new Board();
    protected String name;
    protected String token;


    public Player(String name, String token) {
        this.name = name;
        this.token = token;
    }


    public void display() {
        System.out.println(name + "'s board:");
        b.printBoard();
    }

    public boolean checkWin() {

        if(b.grid[0][0] != "0") {
            return true;
        }

        return false;

    }
}
