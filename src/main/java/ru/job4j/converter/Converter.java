package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(1500);
        System.out.println("1500 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(1500);
        System.out.println("1500 rubles are " + dollar + " dollars.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float input = 120;
        float expectation = 2;
        float output = Converter.rubleToDollar(input);
        boolean pass = expectation == output;
        System.out.println("120 rubles are 2. Test result : " + pass);
    }
}