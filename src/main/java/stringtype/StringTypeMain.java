package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        System.out.println(message);

        boolean b = message.equals("Hello John Doe");
        System.out.println(b);

        boolean c = message.equals("Hello John Doe444");
        System.out.println(c);

        String d = "" + "";
        System.out.println(d.length());

        String s = "Abcde";
        System.out.println(s.length());
        System.out.println(s.charAt(0) + ", " + s.charAt(2));
        System.out.println(s.substring(0,3));
    }
}
