import java.until.Hashset;
import java.until.set;
import java.until.Treeset;
public class nsti{
    public static void main(String args[])
    {
    set <string> setobj=new Hashset<>();
    setobj.add("Hi");
    setobj.add("Hello");
    setobj.add("Welcome");
    setobj.add("to");
    setobj.add("NSTI");
    setobj.remove("Hello");
    System.out.println("Hashset:"+setobj);
    set<string>Hashset to Treeset=new Treeset<>(setobj);
    System.out.println("Treeset :+Hashset to Treeset");
}
}