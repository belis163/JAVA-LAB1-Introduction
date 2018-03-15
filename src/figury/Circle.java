package figury;

public class Circle extends Figure implements Print {

    public Circle(double r) {
        R = r;
    }

    @Override
    protected double calculateArea() {
        return Math.PI * Math.pow(R, 2.0);
    }

    @Override
    protected double calcualtePerimeter() {
        return 2 * Math.PI * R;
    }

    @Override
    protected boolean overZero(double number) {

          if (number > 0) return true;

        return false;
    }

    @Override
    public void print() {
        System.out.println("Obwód tego tkoła to: " + this.calcualtePerimeter() + "\nPole: " + this.calculateArea());
    }

    private double R;

    public void setR(double r) {
        R = r;
    }
}
