import java.util.Scanner;
public class NilaiMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // menginputkan npm,nama mahasiswa,nilai kehadiran, nilai tugas, nilai uts, dan nilai uas.
        System.out.print("NPM: ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();
        // menghitung nilai akhir dari nilai yang sebelumnya dinputkan
        double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        // menentukan grade dan keterangan disini menggunakan switch-case
        String grade;
        String keterangan;
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            grade = "A";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            grade = "B";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            grade = "C";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            grade = "D";
        } else {
            grade = "E";
        }
        // switch case untuk keterangan berdasarkan grade
        switch (grade) {
            case "A":
                keterangan = "ISTIMEWA";
                break;
            case "B":
                keterangan = "BAIK";
                break;
            case "C":
                keterangan = "CUKUP";
                break;
            case "D":
                keterangan = "KURANG";
                break;
            default:
                keterangan = "KURANG SEKALI";
                break;
        }
        // hasil output
        System.out.println("\n=== Hasil ===");
        System.out.println("NPM Mahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.printf("Nilai Rata-rata : %.2f\n", nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}

