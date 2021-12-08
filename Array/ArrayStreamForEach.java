import java.util.Arrays;

public class ArrayStreamForEach {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        Arrays.stream(array).forEach(System.out::println);
    }
}
