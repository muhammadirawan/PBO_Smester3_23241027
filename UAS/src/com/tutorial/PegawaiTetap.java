package com.tutorial;

public class PegawaiTetap extends Pegawai{
    private double tunjangan;
    private int durasiLembur;

    public PegawaiTetap(String nama, double gajiPokok, double tunjangan, int durasiLembur) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
        this.durasiLembur = durasiLembur;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setDurasiLembur(int durasiLembur) {
        this.durasiLembur = durasiLembur;
    }

    public void hitungGajiBersih() {
        double lembur = durasiLembur * (0.1 * getGajiPokok());
        double gajiBersih = getGajiPokok() + tunjangan + lembur;

        super.setGajiBersih(gajiBersih);
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Durasi Lembur: " + durasiLembur + " jam");
        System.out.println("Gaji Bersih: " + getGajiBersih());
    }
}
