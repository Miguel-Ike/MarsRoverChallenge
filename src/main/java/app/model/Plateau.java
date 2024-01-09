package app.model;

public class Plateau {
    private int width;
    private int height;

    public Plateau(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean isPositionValid(int x, int y) {
        return x >= 0 && x <= width && y >= 0 && y <= height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        String msg = """
                Plateau:
                \tWidth: %d
                \tHeight: %d
                """.formatted(width, height);
        return msg;
    }
}
