public class keyboard {
	protected String huruf,simbol;
	protected int angka;
	
	protected void Mengetik () {
		System.out.println ("Mengetik Kalimat");
	}
	
	protected void OperasiHitung () {
		System.out.println ("Menghitung Data");
	}
	
public class buku {
	protected String kertas,tulisan ;
	
	protected void baca () {
		System.out.println ("Terang");
	}
	
	protected void ditulis () {
		System.out.println ("redup");
	}
}	
public static void main (String[] args) {
		keyboard asus= new keyboard();

		asus.huruf = "abc";
		asus.simbol = "!@#";
		asus.Mengetik();
		
	}
}