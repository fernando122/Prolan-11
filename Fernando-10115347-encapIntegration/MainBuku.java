class Buku extends Data{
	
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

public class MainBuku{
	public static void main(String[] args) {
        System.out.println("---------Data Buku---------");
		Buku book = new Buku();
		book.data_buku();
		book.ukuran_buku();
		book.harga_buku();
		System.out.println(book.jumlah_harga(75000, 7500));
                System.out.println("-------Data Tulisan--------");
                Tulisan font = new Tulisan();
                font.setTipe("Times New Roman");
                font.setWarna("Hitam");
                font.setUkuran(14);
                System.out.println("Jenis Tulisan \t:"+ font.getTipe());
                System.out.println("Warna Tulisan \t:"+ font.getWarna());
                System.out.println("Ukuran Tulisan \t:"+ font.getUkuran());
                
	}
}
		