package figury;

public class Square extends Figure implements Print {
    @Override
    protected double calculateArea() {
        return side*side;
    }

    @Override
    protected double calcualtePerimeter() {
        return side*4;
    }

    @Override
    protected boolean overZero(double number) {
        if (number > 0) return true;
        return false;
    }

    @Override
    public void print() {
        System.out.println("Obwód tego kwadratu to: " + this.calcualtePerimeter() + "\nPole: " + this.calculateArea());
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    private double side;
}
