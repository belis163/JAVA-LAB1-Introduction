package figury;

public abstract class Figure {
    abstract protected double calculateArea();
    abstract protected double calcualtePerimeter();
    abstract protected boolean overZero(double number);
}

interface Print {
    void print();

}