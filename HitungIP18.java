import java.util.Scanner;

public class HitungIP18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        String
        studentName, courceName, courceScore, option;
        int 
        sks, courceTotal = 1, sksTotal = 1, k = 1;
        double
        finalScore, score = 0.0;
        

            System.out.println("====================================================");
            System.out.println("       Program Perhitungan Indeks Prestasi (IP)      ");
            System.out.println("====================================================\n");
            System.out.print("Masukkan Nama Mahasiswa                : ");
            studentName = sc18.nextLine();

        do {

            int i = 0;
            int j = 0;

            System.out.print("Masukkan Nama Mata Kuliah              : ");
            i++;
            courceName = sc18.nextLine();
            System.out.print("Masukkan Nilai Huruf (A,B,B+,C,C+,D,E) : ");
            courceScore = sc18.nextLine();
            System.out.print("Masukkan Jumlah SKS                    : ");
            j++;
            sks = sc18.nextInt();
            System.out.print("\nLanjutkan Input Nilai? (Y/N)         : ");
            option = sc18.next();
            System.out.print("====================================================\n");

            if (courceScore.equalsIgnoreCase("A")) {
                score = 4.0;
            } else if (courceScore.equalsIgnoreCase("B+")) {
                score = 3.5;
            } else if (courceScore.equalsIgnoreCase("B")) {
                score = 3.0;
            } else if (courceScore.equalsIgnoreCase("C+")) {
                score = 2.5;
            } else if (courceScore.equalsIgnoreCase("C")){
                score = 2.0;
            } else if (courceScore.equalsIgnoreCase("D")) {
                score = 1.0;
            } else if (courceScore.equalsIgnoreCase("E")) {
                score = 0.0;
            }

            if (courceScore == "D" && courceScore == "E") {
                k++;
            } else {
                
            }

            courceName += courceTotal;
            finalScore = ((score * sks) / sks);
            
        } while (!option.equalsIgnoreCase("N") );

            System.out.println("====================================================");
            System.out.println("        Hasil Perhitungan Indeks Prestasi (IP)      ");
            System.out.println("====================================================\n");

            System.out.println("Nama Mahasiswa                      : " + studentName);
            System.out.println("Indeks Prestasi (IP)                : " + finalScore);
            System.out.println("Jumlah Mata Kuliah                  : " + courceTotal);
            System.out.println("Jumlah SKS                          : " + sksTotal);
            System.out.println("Jumlah Matkul yang harus diperbaiki : " + k);

            System.out.println("====================================================");
            System.out.println("           Terimakasih dan Tetap Semangat           ");
            System.out.println("====================================================\n");

    }
}