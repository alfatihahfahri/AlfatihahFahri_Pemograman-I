import java.util.Scanner;

public class TugasPertemuan2_AlfatihahFahri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama            : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM             : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Jenis Kelamin (L/P) : ");
        String jk = input.nextLine();

        System.out.print("Masukkan Umur            : ");
        int umur = input.nextInt();

        System.out.print("Masukkan Nomor Absen     : ");
        int absen = input.nextInt();
        input.nextLine(); 

        System.out.print("Masukkan Tempat Tinggal  : ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Kelas           : ");
        String kelas = input.nextLine();

        System.out.print("Masukkan Jurusan         : ");
        String jurusan = input.nextLine();

        System.out.println("\n=== Informasi Data Mahasiswa (Lengkap) ===");
        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + nim);
        System.out.println("Jenis Kelamin   : " + jk);
        System.out.println("Umur            : " + umur + " Tahun");
        System.out.println("No. Absen       : " + absen);
        System.out.println("Tempat Tinggal  : " + alamat);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Jurusan         : " + jurusan);
    }
}