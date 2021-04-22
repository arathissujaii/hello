import java.util.*;
class GFG{
    public static void main(String args[])
    {
    Set <String> Setobj=new HashSet<>();
    Setobj.add("Hi");
    Setobj.add("Hello");
    Setobj.add("Welcome");
    Setobj.add("to");
    Setobj.add("NSTI");
    System.out.println("HashSet:"+Setobj);
    Set<String>HashSetToTreeSet=new TreeSet<>(Setobj);
    System.out.println("TreeSet :"+HashSet to TreeSet);
}
}