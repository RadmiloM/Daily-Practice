import java.util.Arrays;

public class ArrayStreamAverage {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        double[] result = Arrays.stream(array).average().stream().toArray();
        System.out.println(Arrays.toString(result));
    }
}
