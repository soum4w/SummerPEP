package programs;

public class Palindrome {
    static boolean isPalindrome(String s){
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
    public static void main(String[] args) {
        String a = "nedden";
        System.out.println(isPalindrome(a)?"Palindrome" : "Not a palindrome");
    }
}
