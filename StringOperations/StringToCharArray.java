public class StringToCharArray {
    public static void main(String[] args) {
        String s = "This is conversion between string and chars";
        for(var ch : s.toCharArray()){
            System.out.println(ch);
        }
    }
}
