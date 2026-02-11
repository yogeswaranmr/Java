package basics;

public class Strings {
    public static void main(String[] args){
        String s = "abcd";
        System.out.println("The string "+s+" has "+s.length()+" letters");

        // s[0] won't work, use s.charAt(0)
        System.out.println(s.indexOf("a"));
    }
}
