
package studikasus2;

import java.util.Scanner;


public class Method {
    Scanner input = new Scanner (System.in);
    int harga1,harga2,total,bayar,kembalian;
    
    void harga(){
        System.out.println("Masukan harga barang 1 Rp: ");
        harga1=input.nextInt();
        System.out.println("Masukan harga barang 2 Rp: ");
        harga2=input.nextInt();
        System.out.println("Masukan pembayaran anda Rp: ");
        bayar = input.nextInt();
        total = (harga1+harga2);
        kembalian = (bayar-total);
    }
    void hitung(){
        System.out.println("Menghitung hasil akhir :");
        System.out.println("Total yang perlu dibayarkan Rp : "+total);
        System.out.println("Kembalian anda Rp : "+kembalian);
    }
    int hasil(){
        System.out.println("=====================");
        System.out.print("Harga barang pertama anda adalah Rp: ");
        return harga1;
    }
    int hasil1(){
        System.out.print("Harga barang kedua anda adalah Rp: ");
        return harga2;
    }
    int hasil2(){
        System.out.print("Total Harga Rp: ");
        return total;
    }
    int hasil3(){
        System.out.print("Total yang anda bayarkan Rp : ");
        return bayar;
    }
    int hasil4 (){
        System.out.print("Kembalian anda Rp : ");
        return kembalian;
    }
}
