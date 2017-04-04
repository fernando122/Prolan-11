class data{
	String judul = "Maling Kundang";
	String warna = "Hijau";
	String penulis = "Tika Ikanegara";
	String penerbit = "Mulia Jaya";
	String jenis = "Cerita Rakyat";
	int harga = 75000;
	byte jum_hal = 80;
	byte p = 35;
	byte l = 48;
	
	public void data_buku(){
		System.out.println("Judul Buku \t:" +judul);
		System.out.println("Penulis Buku \t:" +penulis);
		System.out.println("Penerbit Buku \t:" +penerbit);
	}
	public void jenis_buku(){
		System.out.println("Jenis Buku \t:" +jenis);
	}
	public void harga_buku(){
		System.out.println("Harga Buku \t:" +harga);
	}
	public void ukuran(){
		System.out.println("Panjang Buku \t:" +p +" cm");
	}
	public data(String warna){ 
		this.warna = warna;
	}
	public void warna_buku(){ 
		System.out.println("Warna Buku \t:" +warna);
	}
}

class Buku extends data{
	public void data_buku(){
		super.data_buku();
		System.out.println("Jumlah Halaman \t:" +jum_hal+" lembar");
	}
	public void jenis_buku(){
		super.jenis_buku();
	}
	public void harga_buku(){ 
		super.harga_buku();
	}
	public void ukuran(){
		super.ukuran();
		System.out.println("Lebar Buku \t:" +l +" cm");
	}	
	public Buku(String warna){ //Konstruktor
		super(warna);
	}		
}

public class MainBuku{
	public static void main(String[] args) {
		Buku dongeng = new Buku("Hijau");
		data jenis = new data("data");
		dongeng.data_buku();
		jenis.jenis_buku();
		dongeng.warna_buku();
		dongeng.ukuran();
		dongeng.harga_buku();
	
	}
}