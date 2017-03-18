import java.util.Scanner;
	public class tugaslab {
		Scanner input = new Scanner(System.in);
		
		float nilai_ip, rata_rata, jum_ip; 
		int jum_mhs, jum_lulus, jum_gagal;
		
			float data (int a){
				a++ ; 
				System.out.print("Masukan IP Mahasiswa : ");
				return input.nextFloat();
			}
			int isWithinRange(float X, float min, float max){
				int cek = (((X >= min) && (X <= max)) ? 1 : 0) ;
				return cek ;
			}        	
		
			public static void main(String[] args) {
				tugaslab ip_mhs = new tugaslab();
				while ((ip_mhs.nilai_ip = ip_mhs.data(ip_mhs.jum_mhs)) != -999)
					if (ip_mhs.isWithinRange(ip_mhs.nilai_ip, 0f, 4f) == 1) {
						ip_mhs.jum_mhs++;
							if (ip_mhs.isWithinRange(ip_mhs.nilai_ip, 2.75f, 4f) == 1) {
								ip_mhs.jum_lulus++;
							}
							else {
								ip_mhs.jum_gagal++;
							}
							ip_mhs.jum_ip += ip_mhs.nilai_ip;
						}
						if (ip_mhs.jum_mhs > 0 ){ 
							ip_mhs.rata_rata = ip_mhs.jum_ip / ip_mhs.jum_mhs;
							
							System.out.println("\t\nBanyak Mahasiswa \t\t: " +ip_mhs.jum_mhs);
							System.out.println("Banyak Mahasiswa Lulus \t\t: " +ip_mhs.jum_lulus);
							System.out.println("Banyak Mahasiswa Tidak Lulus \t: " +ip_mhs.jum_gagal);
							System.out.println("Rata - Rata IP Mahasiwa \t: " +ip_mhs.rata_rata);
						}		
						else 
							System.out.println("Tidak Ada Data yang Dimasukan");			
			}
	}
	
		
							
      
						