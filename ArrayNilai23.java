import java.util.Scanner;
/**
 * ArrayNilai23
 */
public class ArrayNilai23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Masukkan Nilai Akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }            
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!");
            }else if (nilaiAkhir[i] <70) {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
            }
        }        
        sc.close();
    }
}