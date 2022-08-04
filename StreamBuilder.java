import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBuilder {

    public static void main(String[] args) {


        Stream.Builder<String> builder =  Stream.builder();

        // Adding elements in the stream of Strings
        Stream<String> stream = builder
                .add("Tokyo")
                .add("New York")
                .add("Toronto")
                .build();

        //stream.forEach(System.out::println);

        //Different Terminal nd non-terminal operations
        List<String> cityWithT = stream.filter(city -> city.startsWith("T")).collect(Collectors.toList());
        System.out.println(cityWithT);

        //Terminal operation to find min on the stream entries
        stream.min(Comparator.comparing(city->city.length())).get();


    }
}
