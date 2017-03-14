public class Buku {
	public String data_buku;
	public void judul () {
		String judul_buku = "Malin Kundang";
		System.out.println("\t\t" + judul_buku);
	}
	public void penerbit (){
		String nama_penerbit = "Mulia Jaya";
		System.out.println("Penerbit 	: "+ nama_penerbit);
	}
	public void angka () {
		int harga = 75000;
		float diskon = 0.1f;
		byte jum_hal = 80;
		System.out.println("Harga Buku Rp	: " + harga);
		System.out.println("Diskon Buku 	: " + diskon);
		System.out.println("Jumlah Halaman	: " + jum_hal);
	}
	String Warna_Buku; //Konstruktor
		Buku() {
			Warna_Buku = "Hijau";
		}
	private void MethodOverloading(String penulis) { //Method Overloading
		System.out.println(penulis);
	}
	private void MethodOverloading(String penulis1, String penulis2) {
		System.out.println(penulis1 + penulis2);
	}
	public int jumlah_harga ( int harga_buku, int diskon_buku) { //Method Return
		return  harga_buku - diskon_buku;
	}
	String kode; // Penggunaan This
		public void kode_buku(String MK) {
			this.kode = MK;
		}
		
	public static void main (String[] args) {
		Buku dongeng = new Buku();
		dongeng.data_buku = "Legenda";
		dongeng.judul();
		dongeng.angka();
		dongeng.penerbit();
		Buku warna = new Buku();
		System.out.println("Warna Buku 	: " + warna.Warna_Buku);
		warna.MethodOverloading("Penulis 	: Tika Ikanegara");
		warna.MethodOverloading("Penulis 	: Tika Ikanegara"," Budi Sudarjo");
		System.out.print("Total Harga	: " );
		System.out.println(dongeng.jumlah_harga(75000, 7500));
		System.out.println(dongeng.kode);
	}
}
	
	
	