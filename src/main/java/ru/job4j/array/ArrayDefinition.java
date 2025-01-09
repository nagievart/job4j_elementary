package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println(ages.length);
        String[] surnames = new String[100500];
        System.out.println(surnames.length);
        float[] pieces = new float[50];
        System.out.println(pieces.length);
        String[] names = new String[4];
        names[0] = "Artur Nagiev";
        System.out.println(names[0]);
        names[1] = "Mariia Nagieva";
        System.out.println(names[1]);
        names[2] = "Ivan Ivanovich";
        System.out.println(names[2]);
        names[3] = "Boris Borisovich";
        System.out.println(names[3]);
    }
}
