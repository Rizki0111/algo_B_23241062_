public class App {
    public static void main(String[] args) throws Exception {
        // Program Biodata Mahasiswa
        // deklarasi variable
        String nama;
        String nim;
        String tgl_lahir;
        String alamat;
        float berat_badan;
        float tinggi_badan;

        // mengisi variable
        nama = "Rizki Yolandika";
        nim = "23241062";
        tgl_lahir = "11 desember 2004";
        alamat = "Lingkungan pohdana";
        berat_badan = 46.5f;
        tinggi_badan = 162.5f;

        // cetak biodata
        System.out.println("==============");
        System.out.println("Nama" + nama); 
        System.out.println("Nim" + nim);
        System.out.println("Tanggal Lahir : " + tgl_lahir);
        System.out.println("Alamat : " + alamat);
        System.out.println("Berat Badan : " + berat_badan);
        System.out.println("Tinggi Badan : " + tinggi_badan);
        System.out.println("===============");
    }
}
