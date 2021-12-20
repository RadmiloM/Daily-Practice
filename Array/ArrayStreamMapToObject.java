import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamMapToObject {
    public static void main(String[] args) {
        IntStream numbers = IntStream.range(1,99);
        Stream<String> strings = numbers.mapToObj(num->Integer.toBinaryString(num));
        strings.forEach(System.out::println);
    }
}
