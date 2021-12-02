import java.util.Arrays;

public class ArrayStreamMax {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        int maximum = Arrays.stream(array).max().getAsInt();
        System.out.println(maximum);
    }
}
