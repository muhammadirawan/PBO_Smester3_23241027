class Mahasiswa{
    // data member atau atribut
    String nama;
    String NIM;

    Mahasiswa(String Nama, String NIM){
        this.nama = Nama;
        this.NIM = NIM;
    }

    // method tanpa parameter dan return
    void cetak(){
        // mencetak nama dan NIM
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

     // method tanpa return dengan parameter
     void setNama(String nama){
        this.setNama(nama);
     }

     // method dengan return tanpa parameter
     String getNama(){
        return this.nama;
     }

     String getNIM(){
        return this.NIM;
     }

     // method dengan parameter dan return
     String sayHi(String nama){
        this.nama = nama;
        return "Selamat datang, " + this.nama + " di Aplikasi SIAKAD";
     }
}





public class App {
    public static void main(String[] args) throws Exception {
       Mahasiswa mhs_1 = new Mahasiswa("Angga Tampan", "23241024");

       mhs_1.cetak();

        // memanggil method setNama()
    mhs_1.setNama("babadae");
    // cetak setelah ubah nama 
    mhs_1.cetak();


        // memanggil method getNama dan getNIM
        String nama_mhs = mhs_1.getNama();
        String nim_mhs = mhs_1.getNIM();
        System.out.println("Nama : " + nama_mhs);
        System.out.println("NIM : " + nim_mhs);

        // memanggil method sayHi
        String pesan = mhs_1.sayHi(mhs_1.nama);
        System.out.println(pesan);

    }
}
 