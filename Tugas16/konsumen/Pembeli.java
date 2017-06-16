package konsumen;


public class Pembeli implements Interface {

    @Override
    public String namap() {
        System.out.println("Nama Pembeli \t:Budi");
        return null;
    }

    @Override
    public String nimp() {
        System.out.println("NIM Pembeli \t:10115322");
        return null;    
    }

    @Override
    public String kelasp() {
        System.out.println("Kelas Pembeli \t:IF-9");
        return null;
    }

}
