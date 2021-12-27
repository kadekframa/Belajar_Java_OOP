import java.util.Scanner;

public class hitungGajiPegawai {
    public static void main(String[] args) {
        float gaji_pokok = 1000000;
        float total_gaji;
        float masa_kerja;
        float tunj_anak;
        float tunj_istri;
        float istri;
        float anak;
        float ken_gaji = 0;

        /*Inputan data*/
        System.out.print ("Masukan Masa kerja (Thn) : ");
        Scanner sc = new Scanner(System.in);
        masa_kerja = sc.nextFloat();
        System.out.print ("Masukan jumlah istri : ");
        Scanner sc1 = new Scanner(System.in);
        istri = sc1.nextFloat();
        System.out.print ("Masukan jumlah anak : ");
        Scanner sc2 = new Scanner(System.in);
        anak = sc2.nextFloat();

        /*Proses perhitungan tunjangan anak dan istri*/
        tunj_istri = (float)(gaji_pokok * 0.10) * istri;
        tunj_anak = (float)(gaji_pokok * 0.20) * anak;

        /*Pemilihan masa kerja dengan fungsi IF*/
        if (masa_kerja <= 5)
        {
            gaji_pokok = (float)gaji_pokok;
        }
        else if (masa_kerja <= 10)
        {
            ken_gaji = (float)(gaji_pokok * 0.25);
        }
        else if (masa_kerja <= 14)
        {
            ken_gaji = (float)(gaji_pokok * 0.50);
        }
        else if (masa_kerja <= 19)
        {
            ken_gaji = (float)(gaji_pokok * 0.75);
        }
        else if (masa_kerja <= 24)
        {
            ken_gaji = (float)(gaji_pokok * 1);
        }
        /*Perhitungan total gajil*/
        total_gaji = gaji_pokok + ken_gaji + tunj_istri + tunj_anak;
        /*Menampilkan hasil*/
        System.err.println ("\nGaji Pokok      : " +gaji_pokok);
        System.err.println ("Kenaikan Gaji   : " +ken_gaji);
        System.err.println ("Tunjangan Istri : " +tunj_istri);
        System.err.println ("Tunjangan Anak  : " +tunj_anak);
        System.err.println ("================================ +");
        System.err.println ("Total gaji      : " +total_gaji);
    }
}
