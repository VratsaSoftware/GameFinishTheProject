package tictactoe;

public class MovingAndMap {
    private final int HEIGHT_MAP = 3;
    private final int WEIGHT_MAP = 3;
    private Symbols[][] map;
    private int moveCount;
    public static boolean isGame;

    public MovingAndMap() {
        map = new Symbols[HEIGHT_MAP][WEIGHT_MAP];
        createMap();
        this.moveCount = 1;
        isGame = true;
    }

    public void createMap() {
        for (int i = 0; i < HEIGHT_MAP; i++) {
            for (int j = 0; j < WEIGHT_MAP; j++) {
                map[i][j] = new EmptySymbol(' ');
            }
        }
        printMap();
    }

    public void printMap() {
        for (Symbols[] a : map) {
            for (Symbols b : a) {
                System.out.print(b.getSymbol() + " |");
            }
            System.out.println();
        }
    }

    public void move(int x, int y) {
        if (map[x][y].getSymbol() == ' ') {
            if (moveCount % 2 != 0) {
                map[x][y] = new Symbols('X');
            } else {
                map[x][y] = new Symbols('O');
            }
            if (checkForChecks()) {
                isGame = false;
                System.out.println("CHECK FOR " + map[x][y].getSymbol() + "!");
            } else
                moveCount++;
        }
    }

    public boolean checkForChecks() {
        return horizontalCheck() || verticalCheck() || diagonalCheck();
    }

    public boolean horizontalCheck() {
        return (map[0][0].getSymbol() == map[0][1].getSymbol()
                && map[0][0].getSymbol() == map[0][2].getSymbol()
                && map[0][0].getSymbol() != ' ')
                || (map[1][0].getSymbol() == map[1][1].getSymbol()
                && map[1][0].getSymbol() == map[1][2].getSymbol()
                && map[1][0].getSymbol() != ' ')
                || (map[2][0].getSymbol() == map[2][1].getSymbol()
                && map[2][0].getSymbol() == map[2][2].getSymbol()
                && map[2][0].getSymbol() != ' ');
    }

    public boolean verticalCheck() {
        return (map[0][0].getSymbol() == map[1][0].getSymbol()
                && map[0][0].getSymbol() == map[2][0].getSymbol()
                && map[0][0].getSymbol() != ' ')
                || (map[0][1].getSymbol() == map[1][1].getSymbol()
                && map[0][1].getSymbol() == map[2][1].getSymbol()
                && map[0][1].getSymbol() != ' ')
                || (map[0][2].getSymbol() == map[1][2].getSymbol()
                && map[0][2].getSymbol() == map[2][2].getSymbol()
                && map[0][2].getSymbol() != ' ');
    }

    public boolean diagonalCheck() {
        return (map[0][0].getSymbol() == map[1][1].getSymbol()
                && map[0][0].getSymbol() == map[2][2].getSymbol())
                || (map[0][2].getSymbol() == map[1][1].getSymbol()
                && map[0][2].getSymbol() == map[2][0].getSymbol())
                && map[1][1].getSymbol() != ' ';
    }
}
