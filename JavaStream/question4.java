import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class question4 {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("Java", "Stream", "API");

        List<Integer> result = a.stream()  
                .map(String::length)             
                .collect(Collectors.toList());         

        System.out.println(result); 
    }
}