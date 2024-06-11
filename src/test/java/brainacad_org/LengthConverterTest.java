package brainacad_org;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthConverterTest {
    private LengthConverter converter;

    @BeforeEach
    public void setUp() {
        converter = new LengthConverter();
    }

    @Test
    public void testMillimetersToCentimeters() {
        assertEquals(1.0, converter.convert(10, "millimeters", "centimeters"), 0.001);
    }

    @Test
    public void testCentimetersToMillimeters() {
        assertEquals(100.0, converter.convert(10, "centimeters", "millimeters"), 0.001);
    }

    @Test
    public void testDecimetersToMeters() {
        assertEquals(1.0, converter.convert(10, "decimeters", "meters"), 0.001);
    }

    @Test
    public void testMetersToKilometers() {
        assertEquals(1.0, converter.convert(1000, "meters", "kilometers"), 0.001);
    }

    @Test
    public void testKilometersToMeters() {
        assertEquals(1000.0, converter.convert(1, "kilometers", "meters"), 0.001);
    }

    @Test
    public void testInvalidFromUnit() {
        try {
            converter.convert(10, "invalidUnit", "meters");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid from unit", e.getMessage());
        }
    }

    @Test
    public void testInvalidToUnit() {
        try {
            converter.convert(10, "meters", "invalidUnit");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid to unit", e.getMessage());
        }
    }
}
