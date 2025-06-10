import java.util.*;
import java.util.stream.*;
class FilterExample{
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(5, 10, 15, 20, 25);

        List<Integer> evenList = list.stream().filter(n -> n % 2 ==0).collect(Collectors.toList());

        System.out.println(evenList);
    }
}