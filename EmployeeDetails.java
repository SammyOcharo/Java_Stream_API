import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmployeeDetails {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("sammy");
        names.add("Emily");
        names.add("sandra");
        names.add("mathew");

        Stream<String> stream = names.stream();

        //configuration stage stream filter
        // Stream filter takes in a Predicate as parameter
        //Predicate interface contains function test that gets back a boolean true if the exists a name
        // that starts with s
        stream.filter(name-> name.startsWith("s"));

        stream.map(name->name.toUpperCase());



        //terminal operation
        //collect terminal operation
        List<String> filtredNames = stream
                .filter(name -> name.startsWith("s"))
                .collect(Collectors.toList());

        System.out.println(filtredNames);


        // min terminal operation
        stream.min(Comparator.comparing(name->name.length())).get();
    }

}
