public class Palindrome {

    public static boolean isPalindrome(String input) {
        boolean b=true;
        int l=input.length();
        char[] c=new char[l];
        input.getChars(0,l,c,0);
        for (int i=0;i<l/2;i++) {
            b=b&&c[i]== c[l-1-i];
        }
        return b;
    }

    public static void main(String... args) {
       System.out.println(""+Palindrome.isPalindrome("abcdedcba"));
    }

}
