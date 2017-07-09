package buku;

class Buku extends Data{
	
	protected void data_buku(){
		System.out.println("Judul Buku \t:" +judul);
		System.out.println("Penerbit Buku \t:" +penerbit);
		System.out.println("Penulis Buku \t:" +penulis);
		System.out.println("Jenis Buku \t:" +jenis);
		System.out.println("Jumlah Halaman \t:" +jum_hal+" halaman");
                System.out.println("Stock Buku \t:" +Stock_Buku);
		
	}
        public void warna_buku(){
		super.warna_buku();
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
		System.out.print("Total Harga \t:" );
		return(hrg_buku-diskon_buku);
	}
        
}
	
