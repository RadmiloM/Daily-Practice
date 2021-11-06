public class StringEqualsIgnoringCase {
    public static void main(String[] args) {
        String lowerCase = "today is rainy day";
        String upperCase = "TODAY IS RAINY DAY";
        System.out.println(lowerCase.equalsIgnoreCase(upperCase));
    }
}
