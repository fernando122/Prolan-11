class Buku extends DataAbstract{
	
	protected void data_buku(){
		System.out.println("Judul Buku \t:" +judul);
		System.out.println("Penerbit Buku \t:" +penerbit);
		System.out.println("Penulis Buku \t:" +penulis);
		System.out.println("Jenis Buku \t:" +jenis);
		System.out.println("Warna Buku \t:" +warna);
		System.out.println("Jumlah Halaman \t:" +jum_hal+" halaman");
                System.out.println("Stock Buku \t:"+stock);
		
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