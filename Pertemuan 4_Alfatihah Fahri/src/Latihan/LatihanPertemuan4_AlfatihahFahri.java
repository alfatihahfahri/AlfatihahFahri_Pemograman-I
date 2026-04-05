import java.util.Scanner;

public class LatihanPertemuan4_AlfatihahFahri {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Mata Kuliah      : ");
        String matkul = keyboard.nextLine();
        
        System.out.print("Masukkan SKS (2/3)        : ");
        int sks = keyboard.nextInt();
        
        int realisasi = (sks == 3) ? 21 : 14;
        
        System.out.print("Masukkan Jumlah Kehadiran : ");
        int hadir = keyboard.nextInt();
        
        System.out.print("Masukkan Nilai Tugas      : ");
        double tugas = keyboard.nextDouble();
        
        System.out.print("Masukkan Nilai UTS        : ");
        double uts = keyboard.nextDouble();
        
        System.out.print("Masukkan Nilai UAS        : ");
        double uas = keyboard.nextDouble();
        
        double skorHadir = ((double) hadir / realisasi) * 10;
        double skorTugas = (tugas / 100) * 20;
        double skorUTS = (uts / 100) * 30;
        double skorUAS = (uas / 100) * 40;
        
        double totalNilai = (skorHadir + skorTugas + skorUTS + skorUAS) / 4;
        
        System.out.println("\n--- Rekap Nilai: " + matkul + " ---");
        System.out.println("Bobot Kehadiran : " + skorHadir);
        System.out.println("Bobot Tugas     : " + skorTugas);
        System.out.println("Bobot UTS       : " + skorUTS);
        System.out.println("Bobot UAS       : " + skorUAS);
        System.out.println("Total Akhir     : " + totalNilai);
        
        keyboard.close();
    }
}