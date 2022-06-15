package lsieun.asm.analysis.graph;

public class TextBox {
    public final int row;
    public final int col;
    public final int width;
    public final int height;

    public TextBox(int row, int col, int width, int height) {
        this.row = row;
        this.col = col;
        this.width = width;
        this.height = height;
    }

    public static TextBox valueOf(int row, int col, int width, int height) {
        return new TextBox(row, col, width, height);
    }
}
