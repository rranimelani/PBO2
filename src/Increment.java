public class Increment {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Nilai awal a = " + a);
        System.out.println("Post-increment (a++) = " + (a++) + ", a sekarang = " + a);
        System.out.println("Pre-increment  (++a) = " + (++a) + ", a sekarang = " + a);
        a += 1; // a = a + 1
        System.out.println("Setelah a += 1, a = " + a);
    }
}
