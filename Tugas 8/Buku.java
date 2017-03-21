class data{
	String judul,warna,penulis;
	int harga,jum_harga;
	byte jum_hal;
	
	public void data_buku(){
		System.out.println("Judul Buku \t:" +judul);
		System.out.println("Penulis Buku \t:" +penulis);
		System.out.println("Jumlah Halaman \t:" +jum_hal);
	}
	public void harga_buku(){
		System.out.println("Harga Buku \t:" +harga);
	}
	data(String warna){ 
		this.warna = warna;
	}
	public void Warna_Buku(){ 
		System.out.println("Warna Buku \t:" +warna);
	}
}

public class Buku extends data{
	int harga = 75000;
	byte jum_hal = 80;
	
	public void data_buku(){
		judul = "Maling Kundang";
		warna = "Hijau";
		penulis = "Tika Ikanegara";
		super.jum_hal = jum_hal; //Super Attribut
		super.harga = harga;
		super.data_buku(); //Super Method
	}
	public void harga_buku(){ 
		super.harga = harga;
		super.harga_buku();
	}
	public Buku(String warna){ //Super Konstruk
		super(warna);
	}	
public static void main(String[] args) {
		Buku dongeng = new Buku("Hijau");
		dongeng.data_buku();
		dongeng.Warna_Buku();
		dongeng.harga_buku();
	}
}
		