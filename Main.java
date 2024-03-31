interface Drawable {
    // Interface can have constant fields (public, static, final by default)
    final int RED = 1;
    final int GREEN = 2;
    final int BLUE = 3;

    // Interface methods are abstract (public by default)
    void draw();
}

class Square implements Drawable {
    private int color;

    public Square(int color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with color: " + getColorName(color));
    }

    static String getColorName(int color) {
        switch (color) {
            case Drawable.RED:
                return "Red";
            case Drawable.GREEN:
                return "Green";
            case Drawable.BLUE:
                return "Blue";
            default:
                return "Unknown";
        }
    }
}

class Circle implements Drawable {
    private int color;

    public Circle(int color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with color: " + getColorName(color));
    }

    private String getColorName(int color) {
        // Can reuse the getColorName method from Square class
        return Square.getColorName(color);
    }
}

public class Main {
    public static void main(String[] args) {
        Drawable square = new Square(Drawable.RED);
        Drawable circle = new Circle(Drawable.GREEN);

        square.draw(); // Output: Drawing a square with color: Red
        circle.draw(); // Output: Drawing a circle with color: Green
    }
}
