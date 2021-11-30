import java.util.Arrays;

public class ArrayStreamAllMatch {
    public static void main(String[] args) {
        int[] array = {1,2,4,6,5};
        boolean allEven = Arrays.stream(array).allMatch(i->i % 2 ==0);
        System.out.println(allEven);
    }
}
