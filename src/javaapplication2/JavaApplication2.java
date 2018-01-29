//Latihan if-else

import java.util.*;
public class Biasiswa { 
    public static void main (String[] args){
        String nama;
        int umur;
        char bm, bi, mt;
        double pendapatan;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Nama: ");
        nama=input.nextLine();
        
        System.out.print("Gred Bahasa Melayu [sila isi A/B/C/D/E]: ");
        bm=input.next().charAt(0);
        
        System.out.print("Gred Bahasa Inggeris [sila isi A/B/C/D/E]: ");
        bi=input.next().charAt(0);
        
        System.out.print("Gred Matematik [sila isi A/B/C/D/E]: ");
        mt=input.next().charAt(0);
        
        System.out.print("Jumlah pendapatan ibu bapa: RM");
        pendapatan=input.nextDouble();
        
        if(bm=='A' && bi=='A' && (mt=='A' || mt=='B' || mt=='C') && pendapatan<2000){
            System.out.println("Tahniah "+nama+"! Anda layak menerima biasiswa.");
        }
        
        else{
            System.out.println("Maaf "+nama+", anda tidak layak menerima biasiswa.");
        }      
    }
}
