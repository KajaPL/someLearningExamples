package Overloading;

public class ChangingDataTypeOfParameters {
    public String formatNumber(int value) {
        return String.format("%d", value);
    }

    public String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    public String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        ChangingDataTypeOfParameters hs = new ChangingDataTypeOfParameters();
        System.out.println(hs.formatNumber(500));
        System.out.println(hs.formatNumber(89.9934));
        System.out.println(hs.formatNumber(550));
    }
}
