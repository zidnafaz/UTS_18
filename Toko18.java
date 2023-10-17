import java.util.Scanner;

public class Toko18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        
        String 
        namaPelanggan, namaProduk, option, kartuMember, tipePelanggan = "";
        int
        jumlahProduk, i = 0, j = 0;
        double
        harga, diskon, total = 0, diskonTambahan = 0.0, subTotal = 0.0,
        jumlahDiskon = 0.0, totalDiskon, totalBayar;

        System.out.println("====================================================");
        System.out.println("              Program Perhitungan Toko              ");
        System.out.println("====================================================\n");
        System.out.print("Masukkan Nama Pelangan                : ");
        namaPelanggan = sc18.nextLine();

        do {

            System.out.print("Masukkan Nama Produk               : " );
            i++;
            sc18.nextLine();
            System.out.print("Masukkan Jumlah Produk             : ");
            jumlahProduk = sc18.nextInt();
            System.out.print("Masukkan Harga Produk              : ");
            harga = sc18.nextDouble();
            System.out.print("Masukkan Diskon Produk             : ");
            j++;
            diskon = sc18.nextDouble();

            total = harga * jumlahProduk;
            diskon += j;
            
            System.out.print("\nLanjutkan Menambahkan Produk? (Y/N) : ");
            option = sc18.next();
            System.out.print("====================================================\n");
            
        } while (!option.equalsIgnoreCase("N"));
            
            System.out.print("\nApakah Mempunyai Kartu Member? (Y/N) : ");
            kartuMember = sc18.next();
        
            if (kartuMember.equalsIgnoreCase("Y")) {
                if (total >= 200000) {
                    diskonTambahan = 0.1;
                } else {
                    diskonTambahan = 0.05;
                }
            
            } else {
            
            }

            subTotal += total;
            jumlahDiskon += j + (jumlahDiskon + diskonTambahan);
            totalDiskon = jumlahDiskon * subTotal;
            totalBayar = subTotal - totalDiskon;


            System.out.println("====================================================");
            System.out.println("                   Total Pembelian                  ");
            System.out.println("====================================================\n");

            System.out.println("Nama Pelanggan                      : " + namaPelanggan);

            if (tipePelanggan.equals(kartuMember)) {
                System.out.println("Tipe Pelangan                 : Member");
            } else {
                System.out.println("Tipe Pelangan                 : Non-Member");
            }

            System.out.println("Total Item yang Dibeli              : " + i);
            System.out.println("SubTotal                            : " + subTotal);
            System.out.println("Total Diskon                        : " + totalDiskon);
            System.out.println("Total Yang Harus Dibayar            : " + totalBayar);

            System.out.println("====================================================");
            System.out.println("           Terimakasih dan Tetap Semangat           ");
            System.out.println("====================================================\n");

            

    }
}
