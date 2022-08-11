package ru.job4j.converter;

public class Converter {
        public static float rubleToEuro(float value) {
            return value / 70;
        }

        public static float rubleToDollar(float value) {
            return value / 60;
        }

        public static void main(String[] args) {
            float euro = ru.job4j.converter.Converter.rubleToEuro(500);
            System.out.println("500 rubles are " + euro + " euros");
            float dollar = ru.job4j.converter.Converter.rubleToDollar(500);
            System.out.println("500 rubles are " + dollar + " dollars");
        }
}
