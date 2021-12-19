import java.util.stream.IntStream;

public class ArrayStreamRangeIncluded {
    public static void main(String[] args) {
        int[] result = IntStream.range(1,100).toArray();
        for(var number :result){
            System.out.println(number);
        }
    }
}
