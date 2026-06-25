package programs;

public class ReverseString {
    public static void main(String[] args) {
        String s = "ABcde";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(rev);
    }
}
