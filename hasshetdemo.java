import java.util.*;
class nsti{
    public static void main(String args[]){
        Set <String> Setobj=new HashSet<>();
        Setobj.add("Hai");
        Setobj.add("Hello");
        Setobj.add("why");
        System.out.println("HashSet:"+Setobj);
        Set<String>HashSetToTreeSet=new TreeSet<>(Setobj); 
       System.out.println("Treeset:"+HashSetToTreeSet);
    }
}
