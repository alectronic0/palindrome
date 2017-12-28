package co.alectronic.palindrome;

public class Main {

//    public static void main(String... args){
//        ispalindrome(args[0]);
//    }

    static boolean ispalindrome(String s) {
        if (s != null) {
            boolean b = true;
            for (int i = 0; i < s.length() / 2; i++) {
                b = +s.charAt(i) == s.charAt(s.length() - (i + 1));
            }
            return b;
        } else {
            return false;
        }
    }


    static boolean ispalindromeRec(String s) {
        return (s != null)
                && (
                (s.length() <= 1)
                        || (
                        s.charAt(0) == s.charAt(s.length() - 1)
                                && ispalindromeRec(s.substring(1, s.length() - 1))
                )
        );
    }
}
