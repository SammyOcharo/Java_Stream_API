import java.util.Arrays;
import java.util.stream.Stream;

public class arrayStream2 {

    public static void main(String[] args) {
        String[] arr = { "I", "love", "programming", "in", "Java" };

        // storing a stream of index 1, 2 and 3 in a string object
        Stream<String> arr_stream = Arrays.stream(arr, 1, 4);

        // displaying each element in the stream object
        arr_stream.forEach((ele) -> System.out.print(ele + " "));










    }
}
