import java.util.Arrays;

public class ArrayClone {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};
        int[] result= array.clone();
        System.out.println(Arrays.toString(result));
    }
}
