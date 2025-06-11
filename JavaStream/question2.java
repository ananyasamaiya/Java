import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class question2 {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("Ram", "Shyam", "Om", "Sita","ananya");

        List<String> result = a.stream()
                .filter(name -> name.length() > 3)  
                .map(String::toUpperCase)             
                .collect(Collectors.toList());         

        System.out.println(result); 
    }
}