import java.util.Scanner;

public class perkalianMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriksA;
        int[][] matriksB;
        int[][] matriksC;

        int baris;
        int kolom;

        // Input jumlah baris & kolom.
        // Jika jumlah baris & kolom tidak sama,
        // user diminta untuk melakukan input baris & kolom lagi

        do {
            System.out.print("Masukkan Baris: ");
            baris = input.nextInt();

            System.out.print("Masukkan Kolom: ");
            kolom = input.nextInt();

            System.out.println();

            matriksA = new int[baris][kolom];
            matriksB = new int[baris][kolom];
            matriksC = new int[baris][kolom];
        } while (baris != kolom);


        // Input Matriks A
        System.out.println("Matriks A");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("matriksA [" + i + "][" + j + "] = ");

                int isiMatriks = input.nextInt();

                matriksA[i][j] = isiMatriks;
            }
        }

        // Input Matriks B
        System.out.println("");
        System.out.println("Matriks B");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("matriksB [" + i + "][" + j + "] = ");

                int isiMatriks = input.nextInt();

                matriksB[i][j] = isiMatriks;
            }
        }

        // Hitung perkalian Matriks A dengan Matriks B

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriksC[i][j] = matriksA[i][j] * matriksB[i][j];
            }
        }


        // Tampilkan Matriks A

        System.out.println("\n");

        System.out.println("Matriks A");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriksA[i][j] + "   ");
            }

            System.out.println();
        }


        // Tampilkan Matriks B

        System.out.println("");
        System.out.println("Matriks B");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriksB[i][j] + "   ");
            }

            System.out.println();
        }

        // Tampilkan hasil perkalian Matriks A dengan Matriks B

        System.out.println("\n");
        System.out.println("Hasil Perkalian Matriks A dengan Matriks B: ");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriksC[i][j] + "   ");
            }

            System.out.println();
        }
    }
}
