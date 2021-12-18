import java.util.stream.IntStream;

public class ArrayStreamRangeExcluding {
    public static void main(String[] args) {
        int[] result = IntStream
                .range(0,99)
                .toArray();
        for(Integer number : result){
            System.out.println(number);
        }
    }
}
