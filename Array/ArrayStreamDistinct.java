import java.util.Arrays;

public class ArrayStreamDistinct {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,4,3,2,5};
        int[] result = Arrays.stream(array).distinct().toArray();
        System.out.println(Arrays.toString(result));
    }
}
