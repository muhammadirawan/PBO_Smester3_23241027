import java.util.Scanner;
public class kalkulator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char lanjutkan = 'y';
        while(lanjutkan == 'y') {
            System.out.println("     Menu     ");
            System.out.println("1. Perkalian ");
            System.out.println("2. Pembagian");
            System.out.println("3. Penjumlahan");
            System.out.println("4. Pengurangan");
            
            int nomor;
            System.out.print("Masukkan Pilihan anda : ");
            nomor = scanner.nextInt();
            
            double angka1, angka2;
            System.out.println("Masukkan angka 1: ");
            angka1 = scanner.nextDouble();
            
            System.out.println("Masukkan angka 2: ");
            angka2 = scanner.nextDouble();
            
            double hasil = 0;
            if (nomor == 1) {
                hasil = angka1*angka2;
                System.out.println("Hasil : " + hasil);
            } else if (nomor == 2) {
                if (nomor != 0) {
                    hasil = angka1/angka2;
                System.out.println("Hasil : " + hasil);
                } else {
                    System.out.println("kesalahan");
                }
            } else if (nomor == 3) {
                hasil = angka1+angka2;
                System.out.println("Hasil : " + hasil);
            } else if (nomor == 4) {
                hasil = angka1-angka2;
                System.out.println("Hasil : " + hasil);
            } else {
                System.out.println("Pilihan tidak valid");
            }
            System.out.println("mau melakukan oprasi lagi (y/n) :");
            lanjutkan = scanner.next().charAt(0);
        }
        System.out.println("terimakasih telanh menggunakan kalkulator");
    }
    
}