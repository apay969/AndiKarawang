import java.util.Scanner;

public class AverageCalculation {
    public static void main(String[] args) {
        String username = "wawan";
        String password = "oneone1216";

        String namaUser;
        String passwordUser;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Selamat Datang di System Login");
        System.out.print("Masukkan username : ");
        namaUser = keyboard.nextLine();
        System.out.print("Masukkan Password : ");
        passwordUser = keyboard.nextLine();

        if (namaUser.equals(username) && (passwordUser.equals(password))){
            System.out.println("Anda telah melakukan login");
        } else {
            System.out.println("Akun anda tidak terdaftar didalam sistem kami");}
    }
}

