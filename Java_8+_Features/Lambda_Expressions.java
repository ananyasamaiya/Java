import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Lambda_Expressions{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("rahul");
        list.add("rohit");
        list.add("mohit");
        Collections.sort(list,(a,b)->a.compareTo(b));
       System.out.println(list);
    }
}