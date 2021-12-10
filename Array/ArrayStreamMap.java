import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayStreamMap {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
        arrayList.stream().map(i->i % 2 == 0).forEach(System.out::println);
    }
}
