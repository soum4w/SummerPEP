package programs;

public class ReverseVowels {
    static String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int i=0, j= c.length-1;
        while(i<j){
            while(i<j && !isVowel(c[i])) i++;
            
            while (i<j && !isVowel(c[j])) j--;

            char temp = c[j];
            c[j] = c[i];
            c[i] = temp;
            i++;
            j--;
        }
        return new String(c);
    }

    static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c=='a' || c == 'e' || c=='i' || c=='o' || c=='u';
    }

    public static void main(String[] args) {
        String s = "AehfiU";
        String revVow = reverseVowels(s);
        System.out.println(revVow);
    }
}
