public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
//        System.out.println("ceiling getHeight() called");
        return height;
    }

    public int getPaintedColor() {
//        System.out.println("getPaintedColor() called.");
        return paintedColor;
    }
}
