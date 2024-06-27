import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collectorexample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Python", "C++", "JavaScript");
        List<String> collectedList = stream.collect(Collectors.toList());
        System.out.println(collectedList); // Output: [Java, Python, C++, JavaScript]
    }
}
