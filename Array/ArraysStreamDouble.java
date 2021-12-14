import java.util.Arrays;

public class ArraysStreamDouble {
    public static void main(String[] args) {
        double[] array = new double[]{1,2.2,3.3,4.4};
        double result = Arrays.stream(array)
                .sum();
        System.out.println(result);
    }
}
