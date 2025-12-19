package rs.ac.ni.pmf.oop2.examples.interfaces;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PolygonTest {
    @Test
    void shouldCalculateArea() {
        List<Point> points = List.of(
                new Point(0, 0),
                new Point(1, 0),
                new Point(1, 1),
                new Point(0, 1)
        );

        Polygon polygon = new Polygon(points);
        assertThat(polygon.area()).isEqualTo(1.0);
    }
}
