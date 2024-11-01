import java.util.Scanner;
/**
 * ArrayNilai23
 */
public class ArrayNilai23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i=0; i<10; i++) {
            System.out.println("Masukkan Nilai Akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for(int i=0; i<10; i++) {
            System.out.println("Nilai Akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }
        sc.close();
    }
}