public class Phytagoras {
    public static void main(String[] args) {
        double a = 6;
        double b = 8;
        double c = Math.sqrt(a * a + b * b); // rumus Pythagoras
        double keliling = a + b + c;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("c (sisi miring) = " + c);
        System.out.println("Keliling segitiga = " + keliling);
    }
}