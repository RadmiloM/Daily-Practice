import java.util.Arrays;

public class ArrayStreamCount {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8};
        long counter = Arrays.stream(array).count();
        System.out.println(counter);
    }
}
