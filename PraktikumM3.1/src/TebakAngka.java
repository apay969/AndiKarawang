import java.util.Scanner;
import java.util.Random;

/**
 * kelas yang menjelaskan system tebak angka
 */
public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        /**
         * @param batasAtas angka yang menjadi batasan paling besar
         * @param angkaTebakan angka yang menjadi objek tebakan
         * @param tebakan angka yang sudah berhasil kita input
         * @param jumlahTebakan jumlah tebakan yang berhasil kita tebak
         * @return
         */
        int batasAtas = 100;
        int angkaTebakan = random.nextInt(batasAtas) + 1;
        int tebakan;
        int jumlahTebakan = 0;

        System.out.println("Selamat datang di Permainan Tebak Angka!");
        System.out.println("Saya telah memilih angka antara 1 dan " + batasAtas + ". Coba tebak!");

        /**
         * @param dowhile digunakan untuk mengulang kode yang ada di dalam kurung kurawa
         * @param ifelse dipergunakan untuk mengembalikan kondisi yang sudah dimasukkan diparameter
         */
        do {
            System.out.print("Tebak angka: ");
            tebakan = input.nextInt();
            jumlahTebakan++;

            if (tebakan < angkaTebakan) {
                System.out.println("Angka terlalu kecil. Coba lagi.");
            } else if (tebakan > angkaTebakan) {
                System.out.println("Angka terlalu besar. Coba lagi.");
            }
        } while (tebakan != angkaTebakan);

        System.out.println("Selamat! Anda berhasil menebak angka " + angkaTebakan + " dalam " + jumlahTebakan + " tebakan.");
    }
}