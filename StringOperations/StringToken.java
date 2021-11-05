import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String convertToTokens = "Convert this text to tokens";
        StringTokenizer token = new StringTokenizer(convertToTokens);
        while (token.hasMoreElements()){
            System.out.println(token.nextToken());
        }


    }
}
