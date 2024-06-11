package brainacad_org;

import brainacad_org.shape.IShape;
import brainacad_org.shape.Rectangle;
import brainacad_org.shape.Rhombus;
import brainacad_org.shape.Square;
import brainacad_org.shape.Triangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShapeTest
{
    @Test
    public void testTriangleArea() {
        IShape triangle = new Triangle(3, 4);
        assertEquals(6.0, triangle.calculateArea(), 0.001);
    }

    @Test
    public void testRectangleArea() {
        IShape rectangle = new Rectangle(3, 4);
        assertEquals(12.0, rectangle.calculateArea(), 0.001);
    }

    @Test
    public void testSquareArea() {
        IShape square = new Square(4);
        assertEquals(16.0, square.calculateArea(), 0.001);
    }

    @Test
    public void testRhombusArea() {
        IShape rhombus = new Rhombus(5, 6);
        assertEquals(15.0, rhombus.calculateArea(), 0.001);
    }
}
