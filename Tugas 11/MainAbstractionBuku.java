abstract class data {
	String judul = "Malin Kundang";
	String penerbit = "Mulia Jaya";
	String jenis = "Cerita Rakyat";
	String warna = "Hijau";
	String penulis = "Tika Ikanegara";
	String diskon ="10%";
	byte p = 35;
	byte l = 48;
	int harga = 75000;
	byte jum_hal = 80;

	protected abstract void data_buku();
	protected abstract void ukuran_buku();
	protected abstract void harga_buku();
	protected abstract int jumlah_harga(int hrg_buku, int diskon_buku);
	}

class Buku extends data{
	
	protected void data_buku(){
		System.out.println("Judul Buku \t:" +judul);
		System.out.println("Penerbit Buku \t:" +penerbit);
		System.out.println("Penulis Buku \t:" +penulis);
		System.out.println("Jenis Buku \t:" +jenis);
		System.out.println("Warna Buku \t:" +warna);
		System.out.println("Jumlah Halaman \t:" +jum_hal+" halaman");
		
	}
	
	protected void ukuran_buku(){
		System.out.println("Panjang Buku \t:" +p +" cm");
		System.out.println("Lebar Buku \t:" +l+" cm");
	}
	
	protected void harga_buku(){
		System.out.println("Harga Buku \t:" +harga);
		System.out.println("Diskon Buku \t:" +diskon);
	}
	
	protected int jumlah_harga(int hrg_buku, int diskon_buku){
		System.out.print("Total Harga	:" );
		return(hrg_buku-diskon_buku);
	}
	
}

public class MainAbstractionBuku{
	public static void main(String[] args) {
		Buku book = new Buku();
		book.data_buku();
		book.ukuran_buku();
		book.harga_buku();
		System.out.println(book.jumlah_harga(75000, 7500));
	}
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	