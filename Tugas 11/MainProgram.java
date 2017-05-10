abstract class Mahasiswa  {
	protected abstract void kuliah(String kampus);
	protected abstract void lulus(int ipk);
	protected abstract void tidaklulus();
}

class Fernando extends Mahasiswa {

	
	protected void kuliah (String kampus) {
		System.out.println("Kuliah di "+kampus);
	}
	
	protected void lulus (int ipk){
		System.out.println("Lulus dengan ipk "+ipk);
	}
	
	protected void tidaklulus (){
		System.out.println("Menggulang perkuliahan sampai lulus");
	}

}

public class MainProgram {
	public static void main (String []args){
		Fernando mhs = new Fernando();
		mhs.kuliah("UNIKOM");
		mhs.lulus(3);
		mhs.tidaklulus();
	}
}
