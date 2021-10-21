public class StringBuild {

    public static void main(String[] args) {
        StringBuilder sB = new StringBuilder();
        sB.append("Hello World");
        sB.append(" Today is great day");
        sB.insert(1,"Read");
        sB.delete(1,6);
        sB.reverse();
        System.out.println(sB.length());
        sB.reverse();
        System.out.println(sB);
        sB.insert(1,"e");
        System.out.println(sB);
        sB.replace(0,5,"Hai");
        System.out.println(sB.indexOf("H"));
        System.out.println(sB.indexOf("World"));
        System.out.println(sB.lastIndexOf("o"));
        System.out.println(sB.capacity());
        System.out.println(sB.charAt(0));
        System.out.println(sB.isEmpty());
        String s = "Test string equality";
        System.out.println(sB.equals(s));

        }
    }

