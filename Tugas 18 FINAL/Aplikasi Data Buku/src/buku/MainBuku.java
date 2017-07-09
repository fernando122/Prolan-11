package buku;

import java.util.Scanner;
import konsumen.Pembeli2;
import konsumen.Pembeli;
import konsumen.Biodata;
import toko.Alamat;
import toko.InterfaceToko;
import toko.Jalan;
import toko.Penjaga;

public class MainBuku{
	public static void main(String[] args) {
		Buku book = new Buku();
                Tulisan font = new Tulisan();
                InterfaceToko shop = new InterfaceToko();
                Biodata<String> stringBiodata = new Biodata<>();
                Biodata<Integer> integerBiodata = new Biodata<>();
                Pembeli pem1 = new Pembeli();
                Pembeli2 pem2 = new Pembeli2();
                Penjaga satpam = new Penjaga();
                Alamat alm = new Alamat();
                Jalan<Alamat> jln = new Jalan<>();
        String ulang = "y";
        while (ulang.equals("y")){
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("-----------DAFTAR MENU-----------");
        System.out.println("1. Data Buku");
        System.out.println("2. Data Tulisan");
        System.out.println("3. Data Toko");
        System.out.println("4. Data Penjaga");
        System.out.println("5. Pembeli Pertama");
        System.out.println("6. Pembeli Kedua");
        System.out.println("7. Keluar Program");
        System.out.println("---------------------------------");
        System.out.print("Pilihan Menu : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:{
                System.out.println("------------Data Buku------------");
		book.data_buku();
                book.warna_buku();
		book.ukuran_buku();
		book.harga_buku();
                System.out.println(book.jumlah_harga(75000, 7500));
                break;
            }
            case 2:{
                System.out.println("----------Data Tulisan-----------");
                font.setTipe("Times New Roman");
                font.setWarna("Hitam");
                font.setUkuran(14);
                System.out.println("Jenis Tulisan \t:"+ font.getTipe());
                System.out.println("Warna Tulisan \t:"+ font.getWarna());
                System.out.println("Ukuran Tulisan \t:"+ font.getUkuran());
                break;
            }
            case 3:{
                System.out.println("-----------Data Toko-------------");
                shop.namat();
                shop.namapen();
                shop.alamatt();
                alm.setJalan("Nama Jalan \t:Dipatiukur no 12\n");
		jln.setJalan(alm);		
		System.out.print(jln.getJalan().getJalan());
                break;
            }
            case 4:{
                System.out.println("-----------Data Penjaga----------");
                satpam.npenjaga("Andi Xavier");
                satpam.nomorpeg(53243322);
                satpam.Bpenjaga("34","Laki-Laki");
                break;
            }
            case 5:{
                System.out.println("---------Pembeli Pertama---------");
                pem1.namap();
                pem1.nimp();
                pem1.kelasp();
                Biodata.bioname("Mahasiswa");
                Biodata.bioage(20);
                break;
            }
            case 6:{
                System.out.println("---------Pembeli Kedua-----------");
                pem2.namap();
                pem2.nimp();
                pem2.kelasp();      
                Biodata.bioname("Mahasiswa");
                Biodata.bioage(25);
                break;
            }
            case 7:{
                System.exit(0);
            }
            break;
            }
        System.out.println("---------------------------------");
        System.out.print("Kembali ke Menu Pilihan ?(y/t) ");
            ulang = input.next();
        }
                }
        
        }
