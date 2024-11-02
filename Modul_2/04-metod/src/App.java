class Mahasiswa{
    // Data Member atau atribut
    String nama;
    String nim;

    Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;

    // Method tanpa parameter dan return
    void cetak(){
        // mencetak nama dan nim
        System.out.println("Nama : " +
        this.nama);
        System.out.println("NIM :" +
        this.nim);
    }
        
    // method tanpa return dengan parameter
    void setNama(String nama){
        this.nama = nama;

    }

    //method dengan return tanpa parameter
    String getNama(){
        return this.nama;
    }

    String getNim(){
        return this.nim;
    }

    // method dengan parameter dan return
    String sayHi(String nama){
        this.nama =nama;
        return "Selamat datang, " + this.nama
        + " di Aplikasi SIAKADA";
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Instansiasi atau menciptakan objek
        Mahasiswa mhs_1 = new
    Mahasiswa("Jamal", "12345678");
        // Memanggil method cetak
        mhs_1.cetak();

        // Memanggil method setNama
        mhs_1.setNama("Jhony");
        // cetak setelah ubah nama
        mhs_1.cetak();

        // memanggil method GetNama dan getNIM
        String nama_mhs = mhs_1.getNama();
        String nim_mhs = mhs_1.getNIM();
        System.out.println("Nama : " +
        nama_mhs);
        System.out.println("NIM : + "
        nim_mhs);

        // memanggil method sayHi
        String pesan =
        mhs_1.sayHi(mhs_1.nama);
        System.out.println(pesan);
    }
}
