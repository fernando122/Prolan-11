import java.util.Scanner;
public class nilai{
	public static void main (String[] args ) {
	Scanner input = new Scanner (System.in);
	int Bilangan[] = new int [1000];
	int max=0, A=0, B=0, Tertinggi = 0, Terendah = 99999;
	
	System.out.print ("Masukan jumlah Bilangan : ");
	
	int in = input.nextInt();
	
	for (int x=1; x<=in; x++){
		System.out.print("Bilangan ke-"+x+" = ");
		Bilangan[x] = input.nextInt();	
		
	}
	System.out.print("\nJadi Deret Bilangan bulat = ");
	for(int x=1; x<=in; x++) {
		System.out.print(Bilangan[x]+"  ");
	}
	for(int x=1; x<=in; x++){
		if(Bilangan[x]>Tertinggi){
			Tertinggi=Bilangan[x];
		}
	}
	for(int x=1; x<=in; x++){
		if(Bilangan[x]<Terendah){
			Terendah=Bilangan[x];
		}
	}
	System.out.println("\nBilangan Tertinggi adalah : "+ Tertinggi);
	System.out.println("\nBilangan Terendah adalah : "+ Terendah);	
}
}