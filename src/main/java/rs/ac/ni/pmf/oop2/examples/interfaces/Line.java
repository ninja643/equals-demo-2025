package rs.ac.ni.pmf.oop2.examples.interfaces;

import lombok.Value;

@Value
public class Line implements Figure {
    Point start;
    Point end;
}
