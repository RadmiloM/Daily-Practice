import java.util.Arrays;

public class ArraysStreamSum {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);
    }
}
