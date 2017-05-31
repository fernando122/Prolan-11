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
                System.out.println("--------Pembeli Pertama--------");
                pem1.namap();
                pem1.nimp();
                pem1.kelasp();
                stringBiodata.add("Mahasiswa");
                integerBiodata.add(24);                
                System.out.printf("Status Pembeli\t:%s\n", stringBiodata.get());
                System.out.printf("Usia Pembeli\t:%d\n", integerBiodata.get());
                System.out.println("---------Pembeli Kedua---------");
                pem2.namap();
                pem2.nimp();
                pem2.kelasp();      
                stringBiodata.add("Mahasiswa");
                integerBiodata.add(20);
                System.out.printf("Status Pembeli\t:%s\n", stringBiodata.get());
                System.out.printf("Usia Pembeli\t:%d\n", integerBiodata.get());

                
                
	}
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	