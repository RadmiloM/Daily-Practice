public class StringReplace {
    public static void main(String[] args) {
        String string = "It's 5 in the morning";
        string = string.replace("5","7");
        System.out.println(string);
        string = string.replaceAll("i","e");
        System.out.println(string);
    }
}
