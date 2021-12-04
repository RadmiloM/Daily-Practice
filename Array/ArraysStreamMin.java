import java.util.Arrays;

public class ArraysStreamMin {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        int minimum = Arrays.stream(array).min().getAsInt();
        System.out.println(minimum);
    }
}
