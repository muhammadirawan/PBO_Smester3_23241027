package com.tutorial;

class Lingkaran extends BangunDatar{
    float r;

    Lingkaran(){
        super("Lingkaran");
    }
    Lingkaran(float r){
        super("Lingkaran");
        this.r = r;
    }

    float luas(){
        return (float) (Math.PI * r * r);
    }
    float keliling(){
        return (float) (2 * Math.PI * r);
    }

    void displayInfo(){
        super.displayInfo("radius " + r);
        System.out.println("Luas : " + luas());
        System.out.println("Keiling : " + keliling());
    }
}