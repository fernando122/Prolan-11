abstract class DataAbstract {
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
	protected abstract void harga_buku();
	protected abstract int jumlah_harga(int hrg_buku, int diskon_buku);
	}