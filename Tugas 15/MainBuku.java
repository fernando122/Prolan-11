public class MainBuku{
	public static void main(String[] args) {
                System.out.println("-----------Data Buku-----------");
		Buku book = new Buku();
                Tulisan font = new Tulisan();
                InterfaceToko shop = new InterfaceToko();
                Biodata<String> stringBiodata = new Biodata<>();
                Biodata<Integer> integerBiodata = new Biodata<>();
                InterfacePembeli pem1 = new InterfacePembeli();
                InterfacePembeli2 pem2 = new InterfacePembeli2();
                Penjaga satpam = new Penjaga();
                Alamat alm = new Alamat();
		Jalan<Alamat> jln = new Jalan<Alamat>();
		book.data_buku();
		book.ukuran_buku();
		book.harga_buku();
		System.out.println(book.jumlah_harga(75000, 7500));
                System.out.println("---------Data Tulisan----------");
                font.setTipe("Times New Roman");
                font.setWarna("Hitam");
                font.setUkuran(14);
                System.out.println("Jenis Tulisan \t:"+ font.getTipe());
                System.out.println("Warna Tulisan \t:"+ font.getWarna());
                System.out.println("Ukuran Tulisan \t:"+ font.getUkuran());
                System.out.println("----------Data Toko------------");
                shop.namat();
                shop.namapen();
                shop.alamatt();
                alm.setJalan("Alamat Toko \t:Soekarno Hatta no 14\n");
		jln.setJalan(alm);		
		System.out.print(jln.getJalan().getJalan());
                System.out.println("--------Pembeli Pertama--------");
                pem1.namap();
                pem1.nimp();
                pem1.kelasp();
                Biodata.bioname("Mahasiswa");
                Biodata.bioage(20);
                System.out.println("--------Pembeli Kedua----------");
                pem2.namap();
                pem2.nimp();
                pem2.kelasp();      
                Biodata.bioname("Mahasiswa");
                Biodata.bioage(25);
                System.out.println("----------Data Penjaga---------");
                satpam.npenjaga("Andi");
                satpam.nomorpeg(53243322);
                satpam.Bpenjaga("34","Laki-Laki");		

                
        }

}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	