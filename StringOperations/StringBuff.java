public class StringBuff {
    public static void main(String[] args) {
        StringBuffer sB = new StringBuffer();
        sB.append("Hello");
        sB.append("World");
        System.out.println(sB);
        System.out.println(sB.capacity());
        System.out.println(sB.charAt(0));
        System.out.println(sB.lastIndexOf("l"));
        System.out.println(sB.indexOf("l"));
        System.out.println(sB.lastIndexOf("l",3));
        System.out.println(sB.deleteCharAt(2));
        System.out.println(sB.delete(0,4));
        System.out.println(sB.insert(0,"Reader"));
        System.out.println(sB.reverse());
        System.out.println(sB.replace(0,4,"Read"));
        System.out.println(sB.substring(0,4));
        System.out.println(sB.subSequence(0,4));
        sB.setCharAt(0,'M');
        sB.trimToSize();
        System.out.println(sB);
    }
}

