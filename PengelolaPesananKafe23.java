import java.util.Scanner;

public class PengelolaPesananKafe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahPesanan;
        String[] namaPesanan;
        double[] hargaPesanan;
        double totalBiaya = 0;

        System.out.print("Masukkan jumlah pesanan: ");
        jumlahPesanan = scanner.nextInt();
        scanner.nextLine();

        namaPesanan = new String[jumlahPesanan];
        hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = scanner.nextLine();
            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        for (double harga : hargaPesanan) {
            totalBiaya += harga;
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("\nTotal Biaya: Rp " + totalBiaya);

        scanner.close();
    }
}
