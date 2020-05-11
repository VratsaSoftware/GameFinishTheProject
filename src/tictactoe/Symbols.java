package tictactoe;

public class Symbols {
    public TextureManager texture;

    public Symbols(TextureManager texture) {
        this.texture = texture;
    }

    public String getSymbol() {
        return texture.path;
    }

    public TextureManager getTexture() {
        return texture;
    }
}

