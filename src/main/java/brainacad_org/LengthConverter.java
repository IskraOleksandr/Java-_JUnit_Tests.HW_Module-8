package brainacad_org;

public class LengthConverter {
    public double convert(double value, String fromUnit, String toUnit) {
        double valueInMeters = toMeters(value, fromUnit);
        return fromMeters(valueInMeters, toUnit);
    }

    private double toMeters(double value, String fromUnit) {
        switch (fromUnit.toLowerCase()) {
            case "millimeters":
            case "mm":
                return value / 1000.0;
            case "centimeters":
            case "cm":
                return value / 100.0;
            case "decimeters":
            case "dm":
                return value / 10.0;
            case "meters":
            case "m":
                return value;
            case "kilometers":
            case "km":
                return value * 1000.0;
            default:
                throw new IllegalArgumentException("Invalid from unit");
        }
    }

    private double fromMeters(double value, String toUnit) {
        switch (toUnit.toLowerCase()) {
            case "millimeters":
            case "mm":
                return value * 1000.0;
            case "centimeters":
            case "cm":
                return value * 100.0;
            case "decimeters":
            case "dm":
                return value * 10.0;
            case "meters":
            case "m":
                return value;
            case "kilometers":
            case "km":
                return value / 1000.0;
            default:
                throw new IllegalArgumentException("Invalid to unit");
        }
    }
}
