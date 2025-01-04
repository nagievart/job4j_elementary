package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println("140 rubles are " + euro + " euro.");
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float inputForDollar = 180;
        float expectForDollar = 3;
        float outputForDollar = Converter.rubleToDollar(inputForDollar);
        boolean passedForDollar = expectForDollar == outputForDollar;
        System.out.println("180 rubles are 3. Test result : " + passedForDollar);
    }
}
