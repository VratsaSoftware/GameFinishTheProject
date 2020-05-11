package tictactoe;

public class MovingAndMap {
    private final int HEIGHT_MAP = 3;
    private final int WEIGHT_MAP = 3;
    private TextureManager[][] map;
    private int moveCount;
    public static boolean isGame;

    public MovingAndMap() {
        map = new TextureManager[HEIGHT_MAP][WEIGHT_MAP];
        createMap();
        this.moveCount = 1;
        isGame = true;
    }

    public void createMap() {
        for (int i = 0; i < HEIGHT_MAP; i++) {
            for (int j = 0; j < WEIGHT_MAP; j++) {
                map[i][j] = new TextureManager(i * TestTicTacToe.WIDTH / 3, j * TestTicTacToe.HEIGHT/ 3, TestTicTacToe.WIDTH / 3
                        , TestTicTacToe.HEIGHT / 3, "src\\assets\\tictactoe_empty.png");
                //TestTicTacToe.display.addGraphic(map[i][j]);
            }
        }
        printMap();
    }

    public void printMap() {
        for (TextureManager[] a : map) {
            for (TextureManager b : a) {
                TestTicTacToe.display.addGraphic(b);
                b.render();
            }
        }
    }

    public void move(int x, int y) {
        printMap();
        if (map[x][y].path.equals("src\\assets\\tictactoe_empty.png")) {
            if (moveCount % 2 != 0) {
                TestTicTacToe.display.removeGraphic(map[x][y]);
                map[x][y] = new TextureManager(y * TestTicTacToe.WIDTH / 3, x * TestTicTacToe.HEIGHT / 3, TestTicTacToe.WIDTH / 3
                        , TestTicTacToe.HEIGHT / 3, "src\\assets\\tictactoe_x.png");
            } else {
                TestTicTacToe.display.removeGraphic(map[x][y]);
                map[x][y] = new TextureManager(y * TestTicTacToe.WIDTH / 3, x * TestTicTacToe.HEIGHT / 3, TestTicTacToe.WIDTH / 3
                        , TestTicTacToe.HEIGHT / 3, "src\\assets\\tictactoe_o.png");;
            }
            if (checkForChecks()) {
                isGame = false;
                System.out.println("CHECK FOR " + map[x][y].path + "!");
            } else
                moveCount++;
        }
    }

    public boolean checkForChecks() {
        return horizontalCheck() || verticalCheck() || diagonalCheck();
    }

    public boolean horizontalCheck() {
        return (map[0][0].path.equals(map[0][1].path)
                && map[0][0].path.equals(map[0][2].path)
                && !map[0][0].path.equals("src\\assets\\tictactoe_empty.png"))
                || (map[1][0].path.equals(map[1][1].path)
                && map[1][0].path.equals(map[1][2].path)
                && !map[1][0].path.equals("src\\assets\\tictactoe_empty.png"))
                || (map[2][0].path.equals(map[2][1].path)
                && map[2][0].path.equals(map[2][2].path)
                && !map[2][0].path.equals("src\\assets\\tictactoe_empty.png"));
    }

    public boolean verticalCheck() {
        return (map[0][0].path.equals(map[1][0].path)
                && map[0][0].path.equals(map[2][0].path)
                && !map[0][0].path.equals("src\\assets\\tictactoe_empty.png"))
                || (map[0][1].path.equals(map[1][1].path)
                && map[0][1].path.equals(map[2][1].path)
                && !map[0][1].path.equals("src\\assets\\tictactoe_empty.png"))
                || (map[0][2].path.equals(map[1][2].path)
                && map[0][2].path.equals(map[2][2].path))
                && !map[0][2].path.equals("src\\assets\\tictactoe_empty.png");
    }

    public boolean diagonalCheck() {
        return ((map[0][0].path.equals(map[1][1].path)
                && map[0][0].path.equals(map[2][2].path))
                || (map[0][2].path.equals(map[1][1].path)
                && map[0][2].path.equals(map[2][0].path)))
                && !map[1][1].path.equals("src\\assets\\tictactoe_empty.png");
    }
}
