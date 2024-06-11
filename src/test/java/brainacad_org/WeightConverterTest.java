package brainacad_org;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeightConverterTest {
    private WeightConverter converter;

    @BeforeEach
    public void setUp() {
        converter = new WeightConverter();
    }

    @Test
    public void testMilligramsToGrams() {
        assertEquals(1.0, converter.convert(1000, "milligrams", "grams"), 0.001);
    }

    @Test
    public void testGramsToMilligrams() {
        assertEquals(1000.0, converter.convert(1, "grams", "milligrams"), 0.001);
    }

    @Test
    public void testKilogramsToCentners() {
        assertEquals(1.0, converter.convert(100, "kilograms", "centners"), 0.001);
    }

    @Test
    public void testCentnersToKilograms() {
        assertEquals(100.0, converter.convert(1, "centners", "kilograms"), 0.001);
    }

    @Test
    public void testTonnesToKilograms() {
        assertEquals(1000.0, converter.convert(1, "tonnes", "kilograms"), 0.001);
    }

    @Test
    public void testKilogramsToTonnes() {
        assertEquals(1.0, converter.convert(1000, "kilograms", "tonnes"), 0.001);
    }

    @Test
    public void testInvalidFromUnit() {
        try {
            converter.convert(10, "invalidUnit", "kilograms");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid from unit", e.getMessage());
        }
    }

    @Test
    public void testInvalidToUnit() {
        try {
            converter.convert(10, "kilograms", "invalidUnit");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid to unit", e.getMessage());
        }
    }
}
