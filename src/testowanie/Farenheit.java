package testowanie;

public class Farenheit {

    static double changeToFarenheit(double number) {
        return number * 1.8 + 32;
    }

    static double changeToCelsius(double number) {
        return (5.d / 9) * (number - 32);
    }

}
