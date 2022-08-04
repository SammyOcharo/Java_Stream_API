import java.util.Arrays;
import java.util.stream.Stream;

public class arrayStream {

    public static void main(String[] args) {

        String[] arr = { "I", "love", "programming", "Java"};

        // storing a stream in a string object
        Stream<String> arr_stream = Arrays.stream(arr);

        // displaying each element in the stream object
        arr_stream.forEach((ele) -> System.out.print(ele + " "));

    }


}
