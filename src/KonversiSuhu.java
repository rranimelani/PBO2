public class KonversiSuhu {
    public static void main(String[] args) {
        double c = 10;
        double f = 15;
        double r = 5;

        // a. Celcius <-> Fahrenheit
        System.out.println("a. " + c + " C = " + (c * 9 / 5 + 32) + " F");
        System.out.println("   " + f + " F = " + ((f - 32) * 5 / 9) + " C");

        // b. Celcius <-> Reamur
        System.out.println("b. " + c + " C = " + (c * 4 / 5) + " R");
        System.out.println("   " + r + " R = " + (r * 5 / 4) + " C");

        // c. Fahrenheit <-> Reamur
        System.out.println("c. " + f + " F = " + ((f - 32) * 4 / 9) + " R");
        System.out.println("   " + r + " R = " + (r * 9 / 4 + 32) + " F");
    }
}