import java.util.Arrays;

public class ArrayStreamReduce {
    public static void main(String[] args) {
        int[] arrayOfIntegers = new int[]{1,2,3,4,5,6};
        int result = Arrays.stream(arrayOfIntegers)
                .reduce(0,(element,elements)-> element + elements);
        System.out.println(result);

    }
}
