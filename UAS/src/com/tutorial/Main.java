package com.tutorial;

public class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Budi", 5000000, 100000, 10);
        pegawaiTetap.hitungGajiBersih();
        pegawaiTetap.tampilkanInfo();

        System.out.println();

        PegawaiNonTetap pegawaiTidakTetap = new PegawaiNonTetap("Andi", 3000000, 5);
        pegawaiTidakTetap.hitungGajiBersih(); 
        pegawaiTidakTetap.tampilkanInfo();
    }
}
