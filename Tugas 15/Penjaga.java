public class Penjaga {

	//method generic 
    public <T> void npenjaga (T nama) {
        System.out.println("Nama Penjaga \t:"+nama);     
    }
    public <T> void nomorpeg (T usia) {
        System.out.println("Nomor Penjaga \t:"+usia);
    }

    public <T,N> void Bpenjaga (T x , N y) {
        System.out.println("Usia\t\t:"+x);
        System.out.println("Jenis Kelamin\t:"+y);
    } 
}


