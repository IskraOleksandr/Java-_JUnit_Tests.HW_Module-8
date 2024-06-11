package brainacad_org;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyConverterTest {
    private CurrencyConverter converter;

    @BeforeEach
    public void setUp() {
        converter = new CurrencyConverter();
    }

    private double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    @Test
    public void testConvertUsdToEur() {
        double amountInUsd = 100;
        double expectedAmountInEur = 92;
        double actualAmountInEur = roundToTwoDecimalPlaces(converter.convert("USD", "EUR", amountInUsd));
        assertEquals(expectedAmountInEur, actualAmountInEur, 0.001);
    }

    @Test
    public void testConvertEurToUsd() {
        double amountInEur = 100;
        double expectedAmountInUsd = 108.70;
        double actualAmountInUsd = roundToTwoDecimalPlaces(converter.convert("EUR", "USD", amountInEur));
        assertEquals(expectedAmountInUsd, actualAmountInUsd, 0.001);
    }

    @Test
    public void testConvertGbpToJpy() {
        double amountInGbp = 100;
        double expectedAmountInJpy = 19873.42;
        double actualAmountInJpy = roundToTwoDecimalPlaces(converter.convert("GBP", "JPY", amountInGbp));
        assertEquals(expectedAmountInJpy, actualAmountInJpy, 0.01);
    }

    @Test
    public void testConvertJpyToGbp() {
        double amountInJpy = 15700;
        double expectedAmountInGbp = 79;
        double actualAmountInGbp = roundToTwoDecimalPlaces(converter.convert("JPY", "GBP", amountInJpy));
        assertEquals(expectedAmountInGbp, actualAmountInGbp, 0.01);
    }

    @Test
    public void testInvalidCurrency() {
        double amount = 100;
        try {
            converter.convert("USD", "XYZ", amount);
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid currency code", e.getMessage());
        }
    }
}
