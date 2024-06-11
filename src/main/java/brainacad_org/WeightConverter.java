package brainacad_org;

public class WeightConverter {
    public double convert(double value, String fromUnit, String toUnit) {
        double valueInKilograms = toKilograms(value, fromUnit);
        return fromKilograms(valueInKilograms, toUnit);
    }

    private double toKilograms(double value, String fromUnit) {
        switch (fromUnit.toLowerCase()) {
            case "milligrams":
            case "mg":
                return value / 1000000.0;
            case "grams":
            case "g":
                return value / 1000.0;
            case "kilograms":
            case "kg":
                return value;
            case "centners":
            case "quintals":
            case "c":
                return value * 100.0;
            case "tonnes":
            case "t":
                return value * 1000.0;
            default:
                throw new IllegalArgumentException("Invalid from unit");
        }
    }

    private double fromKilograms(double value, String toUnit) {
        switch (toUnit.toLowerCase()) {
            case "milligrams":
            case "mg":
                return value * 1000000.0;
            case "grams":
            case "g":
                return value * 1000.0;
            case "kilograms":
            case "kg":
                return value;
            case "centners":
            case "quintals":
            case "c":
                return value / 100.0;
            case "tonnes":
            case "t":
                return value / 1000.0;
            default:
                throw new IllegalArgumentException("Invalid to unit");
        }
    }
}
