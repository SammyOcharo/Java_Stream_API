import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfFile {

    public static void main(String[] args) {


        try (Stream<String> lines = Files.lines(Path.of("./FileExample.txt"))) {
            Set<String> words = lines
                    //Splitting then gather words in a flattened stream
                    .flatMap((l) -> Stream.of(l.split(" ")))
                    .collect(Collectors.toSet()); //Collect words in a set

            //....
        } catch (IOException e) {
            e.printStackTrace();
            //...
        }

        //walk method
        try(Stream<Path> paths = Files.walk(Path.of("./"), 3)) { //Traverse for depth 3 in the directory

            int sum = paths.filter(Files::isRegularFile) //Filter regular files
                    .mapToInt((p) -> (int) p.toFile().length()) //Map to file size (long)
                    .sum(); //Calculate sum of file sizes

            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //the find method
        try(Stream<Path> paths = Files.find(Path.of("./"), 2, (p, a) -> { //Predicate
            return a.isRegularFile() &&
                    a.size() > 10240; //Regular file with size > 10KB
        })) {

            paths.forEach((p) -> System.out.println(p));


        } catch (IOException e) {
            e.printStackTrace();
            //...
        }

    }
}
