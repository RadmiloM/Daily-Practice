import java.util.Arrays;

public class ArrayStreamPrint {
    public static void main(String[] args) {
        int[] result = {1,2,3,4,5};
        Arrays.stream(result)
                .forEach(System.out::println);
    }
}
