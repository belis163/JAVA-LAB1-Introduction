package figury;

public class Triangle extends Figure  implements Print{
    @Override
    public double calculateArea() {
        return side1*height*0.5;
    }

    @Override
    public double  calcualtePerimeter() {
        return side3+side2+side1;
    }

    @Override
    protected boolean overZero(double number) {
        if (number > 0) return true;
        return false;
    }

    @Override
    public void print() {
        System.out.println("Obwód tego trójkąta to: " + this.calcualtePerimeter() + "\nPole: " + this.calculateArea());
    }

    @Override
    public String toString() {
        return "Nasz trójkąt ma wymiary: " + side1 +" x "+side2+" x "+side3 + " oraz wysokość: " + height ;
    }

    public Triangle(double side1, double side2, double side3, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getHeight() {
        return height;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double side1;
    private double side2;
    private double side3;
    private double height;
}
