import java.util.Arrays;

public class ArraysFindFirst {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        int first = Arrays.stream(array).findFirst().getAsInt();
        System.out.println(first);
    }
}
