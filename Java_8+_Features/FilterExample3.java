import java.util.*;
class FilterExample3{
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(5, 10, 15, 20, 25);

        int sum = list.stream().reduce(0, (a,b)-> a>b?a:b);
    

        System.out.println(sum);
    }
}