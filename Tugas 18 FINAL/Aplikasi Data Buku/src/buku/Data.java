package buku;

abstract class Data {
	String judul = "Malin Kundang";
	String penerbit = "Mulia Jaya";
	String jenis = "Cerita Rakyat";
	String warna = "Hijau";
	String penulis = "Tika Ikanegara";
	String diskon ="10%";
        String stock ="20";
	byte p = 35;
	byte l = 48;
	int harga = 75000;
	byte jum_hal = 80;
        String Stock_Buku;
            Data(){
                Stock_Buku = "20";
            }
        public void warna_buku(){
            System.out.println("Warna Buku \t:" +warna);
            }    
	protected abstract void data_buku();
        protected abstract void ukuran_buku();
	protected abstract void harga_buku();
	protected abstract int jumlah_harga(int hrg_buku, int diskon_buku);
        
	}
