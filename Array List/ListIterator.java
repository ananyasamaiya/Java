import java.util.ArrayList;
import java.util.Iterator;

class ListIterator{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList();
        list.add("Rahul");
        list.add("Shanti");
        list.add("Mohit");
        list.add("Ananya");
        list.add("Ritik");
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String data = it.next();
            if(data.startsWith("R")){
                it.remove();
            }
        }
        System.out.println(list);
    }
}