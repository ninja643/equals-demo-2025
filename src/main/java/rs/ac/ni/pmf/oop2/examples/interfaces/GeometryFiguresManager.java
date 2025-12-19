package rs.ac.ni.pmf.oop2.examples.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GeometryFiguresManager {
    private List<Figure> figures = new LinkedList<>();

    public void drawAll() {
        for (final Figure figure : figures) {
            System.out.println(figure);
        }
    }

    public double totalArea() {

        if (figures.isEmpty()) {
            return 0.0;
        }

        double totalArea = 0.0;

        for (final Figure figure : figures) {
            if (figure instanceof final Measurable measurable) {
                totalArea += measurable.area();
            }
        }

        return totalArea;
    }
}
