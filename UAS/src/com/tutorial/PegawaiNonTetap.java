package com.tutorial;

public class PegawaiNonTetap extends Pegawai{
    int durasiLembur;

    public PegawaiNonTetap(String nama, double gajiPokok, int durasiLembur) {
        super(nama, gajiPokok);
        this.durasiLembur = durasiLembur;
    }

    public void setDurasiLembur(int durasiLembur) {
        this.durasiLembur = durasiLembur;
    }

    public void hitungGajiBersih() {
        double lembur = durasiLembur * (0.5 * getGajiPokok());
        double gajiBersih = getGajiPokok() + lembur;

        super.setGajiBersih(gajiBersih);
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Durasi Lembur: " + durasiLembur + " jam");
        System.out.println("Gaji Bersih: " + getGajiBersih());
    }
}
