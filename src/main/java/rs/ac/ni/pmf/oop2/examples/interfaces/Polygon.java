package rs.ac.ni.pmf.oop2.examples.interfaces;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class Polygon implements Figure, Measurable {
    private final List<Point> points;

    @Override
    public double area() {
        if (points.size() < 3) return 0;

        final int n = points.size();
        double area = (points.get(0).getY() + points.get(n - 1).getY())
                * (points.get(n - 1).getX() - points.get(0).getX()) / 2;

        for (int i = 0; i < n - 1; i++) {
            final double ydiff = (points.get(i).getY() + points.get(i + 1).getY());
            final double xdiff = (points.get(i + 1).getX() - points.get(i).getX());
            area += ydiff * xdiff / 2;
        }

        return Math.abs(area);
    }
}
