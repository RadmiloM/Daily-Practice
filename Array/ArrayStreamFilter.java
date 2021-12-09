import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayStreamFilter {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        List<Integer> arrayList = Arrays.stream(array).boxed().toList();
        List<Integer> result = arrayList.stream().filter(i->i < 4).collect(Collectors.toList());
        System.out.println(result);
    }
}
