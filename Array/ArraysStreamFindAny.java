import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArraysStreamFindAny {
    public static void main(String[] args) {
        int[] result = new int[]{1,2,3,4,5,6};
        List<Integer> array = Arrays.stream(result).boxed().collect(Collectors.toList());
        Optional<Integer> number = array.stream().findAny();
        System.out.println(number);
    }
}
