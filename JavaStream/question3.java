import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class question3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = list.stream()
                .filter(n-> n % 2 !=0)  
                .reduce(0, (a,b) -> a+b);         

        System.out.println(sum); 
    }
}