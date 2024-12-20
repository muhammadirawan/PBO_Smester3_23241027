package com.tutorial;

public class BangunDatar {
    String namaBangun;

    // Constructor Overloading
    BangunDatar(){
        this.namaBangun = "Bangun Datar";
    }
    BangunDatar(String namaBangun){
        this.namaBangun = namaBangun;
    }

    float luas(){
        return 0;
    }
    float keliling(){
        return 0;
    }

    void displayInfo(){
        System.out.println("Ini adalah " + namaBangun);
    }
    void displayInfo(String tambahan){
        System.out.println("Ini adalah " + namaBangun + " dengan " + tambahan);
    }
}