public class WaktuCahaya {
    public static void main(String[] args) {
        double kecepatanCahaya = 300000;      // km/s
        double jarakBulan = 384400;           // km
        double jarakMatahari = 152100000;     // km (152,1 juta km)

        double waktuBulan = jarakBulan / kecepatanCahaya;       // detik
        double waktuMatahari = jarakMatahari / kecepatanCahaya; // detik

        System.out.println("Waktu cahaya Bumi -> Bulan    : " + waktuBulan + " detik");
        System.out.println("Waktu cahaya Bumi -> Matahari : " + waktuMatahari
                + " detik (" + (waktuMatahari / 60) + " menit)");
    }
}