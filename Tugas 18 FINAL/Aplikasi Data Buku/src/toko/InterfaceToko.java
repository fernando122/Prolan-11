package toko;


import toko.Toko;


public class InterfaceToko implements Toko{

    @Override
    public void namat() {
      System.out.println("Nama Toko \t:"+namat);
    }

    @Override
    public void namapen() {
      System.out.println("Nama Penjual \t:"+namapen);  
    }

    @Override
    public void alamatt() {
        System.out.println("Alamat Toko \t:"+alamatt);  
    }

    

    
}
