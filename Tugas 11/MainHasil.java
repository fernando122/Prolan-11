import java.util.Scanner;

 abstract class Calculator {
    
    protected abstract double hasilTambah(double x, double y);
    protected abstract double hasilKurang(double x, double y);
    protected abstract double hasilKali(double x, double y);
    protected abstract double hasilBagi(double x, double y);
	}

 class hitung extends Calculator{ 
  
    protected double hasilTambah(double x, double y) {
        return (x+y);        
    }

    
    protected double hasilKurang(double x, double y) {
        return (x-y);    
    }

   
    protected double hasilKali(double x, double y) {
        return (x*y);        
    }

    
    protected double hasilBagi(double x, double y) {
        return (x/y);
    }
}

public class MainHasil {
    public static void main(String[] args){
        double opr1,opr2;
        
        hitung cal = new hitung();
        Scanner input = new Scanner(System.in);        
             
        System.out.print("Masukan nilai pertama : ");
        opr1 = input.nextDouble();
        
        System.out.print("Masukan nilai kedua : ");
        opr2 = input.nextDouble();
        
        System.out.print("\nHasil Pertambahan adalah : "+cal.hasilTambah(opr1, opr2));
        System.out.print("\nHasil Pengurangan adalah : "+cal.hasilKurang(opr1, opr2));
        System.out.print("\nHasil Perkalian adalah   : "+cal.hasilKali(opr1, opr2));
        System.out.print("\nHasil Pembagian adalah   : "+cal.hasilBagi(opr1, opr2));
        
    }
}