import java.util.Arrays;

public class ArrayStreamAnyMatch {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        boolean anyMatch = Arrays.stream(array).anyMatch(i->i>3);
    }
}
