import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


class reverseIterator{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList();
        list.add("Rahul");
        list.add("Shanti");
        list.add("Mohit");
        list.add("Ananya");
        list.add("Ritik");
        System.out.println(list);
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String data = it.next();
            System.out.println(data);
        }
        System.out.println("alg hu mai");
        while(it.hasPrevious()){
            String Prevdata = it.previous();
            System.out.println(Prevdata);
        }
    }
}