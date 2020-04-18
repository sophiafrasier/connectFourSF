public class Board {

    String[][] grid = new String[8][8];

    public Board() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                grid[row][col] = "-";
            }
        }
    }

    public void printBoard() {
        System.out.println("Updated board:");
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                System.out.print(grid[row][col]);

            }
            System.out.print("-");
        }
    }

    public boolean makeMove(int col, String token) {
        for (int i = 7; i >= 0; i--) {
            if (grid[i][col].equals("-")) {
                grid[i][col] = token;
                return true;
            }
        }
        return false;

    }


    public boolean checkWin() {

        for (int i = 0; i < 8; i++) {
            if (grid[i][i].equals(grid[i][i + 1].equals(grid[i][i + 2].equals(grid[i][i + 3])))) {
                return true;
            }
            if (grid[i][i].equals(grid[i + 1][i].equals(grid[i + 2][i].equals(grid[i + 3][i])))) {
                return true;
            }
        }
        return false;


    }


    public boolean colHasRoom(int col) {
        if (grid[0][col].equals("-")) {
            return true;
        }
        return false;
    }

}




