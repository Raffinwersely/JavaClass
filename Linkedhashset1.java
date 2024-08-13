import java.util.LinkedHashSet;
public class Linkedhashset1 {
    public Linkedhashset1(){
    }
    public static void main(String[]args){
        LinkedHashSet<String>Linkedset=new LinkedHashSet<>();
        LinkedHashSet<String>LinkedHashset=new LinkedHashSet<>();
        Linkedset.add("R");
        Linkedset.add("A");
        Linkedset.add("F");
        Linkedset.add("F");
        Linkedset.add("I");
        Linkedset.add("N");
        System.out.println("Size of Linkedhashset="+Linkedset.size());
        System.out.println("Orginal LinkedHashSet:"+String.valueOf(Linkedset));
        System.out.println("Removing D From Linkedhashset :"+Linkedset.remove("F"));
        System.out.println("Trying to Remove Z which is not present:"+Linkedset.remove("Z"));
        System.out.println("Checking it A is present="+Linkedset.contains("A"));
        System.out.println("Update Linkedhashset:"+String.valueOf(Linkedset));
    }
}
