import java.util.Arrays;

public class ArrayStreamLong {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        long result = Arrays.stream(array)
                .asLongStream().sum();
        System.out.println(result);
    }
}
