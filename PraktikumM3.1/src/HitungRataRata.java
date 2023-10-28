import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class HitungRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        // Meminta pengguna untuk memasukkan jumlah data
        out.print("Masukkan jumlah data yang akan dihitung rata-ratanya: ");
        int jumlahData = input.nextInt();

        // Inisialisasi variabel untuk menyimpan total
        double total = 0;

        // Meminta pengguna memasukkan data
        for (int i = 1; i <= jumlahData; i++) {
            out.print("Masukkan data ke-" + i + ": ");
            double data = input.nextDouble();
            total += data;
        }

        // Menghitung rata-rata
        double rataRata = total / jumlahData;

        // Menampilkan hasil rata-rata
        out.println("Rata-rata dari " + jumlahData + " data adalah: " + rataRata);
    }
}