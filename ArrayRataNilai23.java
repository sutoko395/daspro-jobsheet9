import java.util.Scanner;
/**
 * ArrayRataNilai23
 */
public class ArrayRataNilai23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMahasiswa;
        int[] nilaiMhs;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        double rataRataLulus;
        double rataRataTidakLulus;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        nilaiMhs = new int[jumlahMahasiswa];
        
        for (int i = 0; i < nilaiMhs.length; i++) {
         System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
         nilaiMhs[i] = sc.nextInt();
         }
         for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }
         rataRataLulus = jumlahLulus > 0 ? totalLulus / jumlahLulus : 0;
         rataRataTidakLulus = jumlahTidakLulus > 0 ? totalTidakLulus / jumlahTidakLulus : 0;
 
         System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
         System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);
 
         sc.close();
    }
}