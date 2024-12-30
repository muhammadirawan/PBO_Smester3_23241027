package com.tutorial;

class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Karyawan kar = new Karyawan();
        Manusia mns; 

        mns = mhs;
        mns.setNama("Aisyah Azahra");
        System.out.println(mns.getNama());

        mns = kar;
        mns.setNama("maryam asyifa");
        System.out.println(mns.getNama());
        
    }
}
