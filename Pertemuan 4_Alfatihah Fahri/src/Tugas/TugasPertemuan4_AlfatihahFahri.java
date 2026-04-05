import java.util.Scanner;

public class TugasPertemuan4_AlfatihahFahri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama Mata Kuliah  : ");
        String namaMatkul = sc.nextLine();
        
        System.out.print("Beban SKS (2/3)   : ");
        int bebanSks = sc.nextInt();
        
        int totalPertemuan = (bebanSks == 3) ? 21 : 14;
        
        System.out.print("Hadir (pertemuan) : ");
        int presensi = sc.nextInt();
        
        double presentaseHadir = ((double) presensi / totalPertemuan) * 100;
        
        if (presentaseHadir < 70) {
            System.out.println("\nStatus: GAGAL (Nilai D)");
            System.out.println("Alasan: Kehadiran hanya " + presentaseHadir + "%, kurang dari syarat 70%.");
        } else {
            System.out.print("Nilai Tugas       : ");
            double nTugas = sc.nextDouble();
            System.out.print("Nilai UTS         : ");
            double nUTS = sc.nextDouble();
            System.out.print("Nilai UAS         : ");
            double nUAS = sc.nextDouble();
            
            double bHadir = ((double) presensi / totalPertemuan) * 10;
            double bTugas = (nTugas / 100) * 20;
            double bUTS   = (nUTS / 100) * 30;
            double bUAS   = (nUAS / 100) * 40;
            
            double hasilAkhir = (bHadir + bTugas + bUTS + bUAS) / 4;
            
            System.out.println("\nHasil Perhitungan Nilai");
            System.out.println("Mata Kuliah     : " + namaMatkul);
            System.out.println("Kehadiran (%)   : " + presentaseHadir + "%");
            System.out.println("Total Skor      : " + hasilAkhir);
            System.out.println("Status          : BERHASIL");
        }
        
        sc.close();
    }
}