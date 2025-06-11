import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class question1 {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list = a.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)              
                .collect(Collectors.toList()); 

        System.out.println(list); 
    }
}