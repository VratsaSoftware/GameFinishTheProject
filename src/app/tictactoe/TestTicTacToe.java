package app.tictactoe;



public class TestTicTacToe {

    static Display display;
    public static MovingAndMap map;
    public static int WIDTH = 600;
    public static int HEIGHT = 600;
    public static InputManager input;

    public TestTicTacToe() {
        runGame();
    }

    public void runGame() {

        display = new Display(600, 600, "TicTacToe");
        input = new InputManager();
        map = new MovingAndMap();

        while (MovingAndMap.isGame) {
            input.update();
            if (map.checkForChecks()) {
                display = new Display(600, 600, "TicTacToe");
                input = new InputManager();
                map = new MovingAndMap();
            }


        }

    }
}
