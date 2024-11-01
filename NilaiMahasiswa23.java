import java.util.Scanner;
public class NilaiMahasiswa23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahMahasiswa;
        int[] nilai;
        int total = 0;
        double rataRata;
        int nilaiTertinggi;
        int nilaiTerendah;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = scanner.nextInt();
        nilai = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai untuk mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
            total += nilai[i];
        }
        rataRata = (double) total / jumlahMahasiswa;
        nilaiTertinggi = nilai[0];
        nilaiTerendah = nilai[0];
        
        for (int n : nilai) {
            if (n > nilaiTertinggi) {
                nilaiTertinggi = n;
            }
            if (n < nilaiTerendah) {
                nilaiTerendah = n;
            }
        }
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Semua nilai yang telah dimasukkan:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
        scanner.close();
    }
}
