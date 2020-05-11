package tictactoe;

public class EmptySymbol extends Symbols {

    public EmptySymbol(int x, int y) {
        super(new TextureManager(x, y, TestTicTacToe.WIDTH, TestTicTacToe.HEIGHT, "src\\assets\\tictactoe_empty.png"));
    }
}