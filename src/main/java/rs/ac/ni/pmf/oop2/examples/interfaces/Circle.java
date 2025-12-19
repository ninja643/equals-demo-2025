package rs.ac.ni.pmf.oop2.examples.interfaces;

public class Circle implements Figure, Measurable {
    private double radius;
    private Point center;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
