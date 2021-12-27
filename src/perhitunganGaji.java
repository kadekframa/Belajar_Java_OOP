import java.util.Scanner;

public class perhitunganGaji {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int jamKerja, jumlah, golongan, Lembur, lamaKerja, gajiPokok, jamLembur ;
        float gajiBersih;
        String namaKaryawan;

        System.out.print("\n\tMasukan Nama : ");
        namaKaryawan=input.next();

        System.out.print("\tMasukan Golongan : ");
        golongan=input.nextInt();

        System.out.print("\tMasukan Jam Kerja : ");
        jamKerja=input.nextInt();


        if (jamKerja>135){
            jamLembur=jamKerja-135;
        }else{
            jamLembur=0;
        }

        switch(golongan){
            case 1 :
                gajiPokok=1500000;
                lamaKerja=250000;
                break;
            case 2 :
                gajiPokok=1850000;
                lamaKerja=280000;
                break;
            case 3 :
                gajiPokok=2000000;
                lamaKerja=320000;
                break;
            default :
                gajiPokok=0;
                lamaKerja=0;
        }

        Lembur=jamLembur*20000;
        gajiBersih=((Lembur+gajiPokok+lamaKerja));

        System.out.println("\n\t========================\n");
        System.out.println("\tNama Karyawan        : "+namaKaryawan);
        System.out.println("\tGaji Pokok 1 Bulan   : "+gajiPokok);
        System.out.println("\tGaji Lembur          : "+Lembur);
        System.out.println("\tTunjangan Lama Kerja : "+lamaKerja);
        System.out.println("\tGaji Bersih          : "+gajiBersih);
    }
}
