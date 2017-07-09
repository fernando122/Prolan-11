package konsumen;

public class Biodata <T> {
    private T bio;
    
    public T getBio(){
        return bio;
    }
    public void setBio(T bio){
        this.bio = bio;
    }
    public static <T> void bioname(T bname){
        System.out.println("Status Pembeli \t:"+bname);
    }
    
    public static <T> void bioage(T bage){
        System.out.println("Usia Pembeli \t:"+bage);
    }
    

}