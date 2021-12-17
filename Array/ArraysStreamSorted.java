import java.util.Arrays;

public class ArraysStreamSorted {
    public static void main(String[] args) {
        int[] array = new int[]{1,33,2,44,11};
        Arrays.stream(array)
                .sorted()
                .forEach(System.out::println);
    }
}
