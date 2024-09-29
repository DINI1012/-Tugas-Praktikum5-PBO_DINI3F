import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input kategori IMT dari pengguna
        System.out.print("Masukkan kategori IMT (1-5): ");
        int kategoriIMT = input.nextInt();
        // menggunakan switch-case untuk menentukan kriterianya
        String kriteria;
        switch (kategoriIMT) {
            case 1:
                kriteria = "Berat Badan Kurang";
                break;
            case 2:
                kriteria = "Berat Badan Ideal";
                break;
            case 3:
                kriteria = "Berat Badan Lebih";
                break;
            case 4:
                kriteria = "Gemuk";
                break;
            case 5:
                kriteria = "Sangat Gemuk";
                break;
            default:
                kriteria = "Tidak Diketahui";
        }
        // output hasil
        System.out.println("Kriteria: " + kriteria);
    }
}
