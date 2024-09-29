public class PernyataanIFELSE {
    public static void main(String[] args) {
        int totalPembelian = 50000;  // input total pembelian
        int diskon = 0;              // variabel untuk menyimpan besarnya diskon
        int jumlahBayar;             // variabel untuk menyimpan jumlah yang harus dibayarkan
        // kondisi untuk menentukan besarnya diskon
        if (totalPembelian < 50000) {
            diskon = totalPembelian * 5 / 100;  // Potongan 5% jika pembelian kurang dari Rp. 50.000
        } else {
            diskon = totalPembelian * 20 / 100; // Potongan 20% jika pembelian lebih dari atau sama dengan Rp. 50.000
        }
        // menghitung jumlah yang harus dibayarkan
        jumlahBayar = totalPembelian - diskon;
        // output hasil
        System.out.println("Total pembelian Rp. = " + totalPembelian);
        System.out.println("Besarnya potongan Rp. = " + diskon);
        System.out.println("Jumlah yang harus dibayarkan Rp. = " + jumlahBayar);
    }
}

