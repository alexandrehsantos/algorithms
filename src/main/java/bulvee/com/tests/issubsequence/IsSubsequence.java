package bulvee.com.tests.issubsequence;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "ab";
        String t = "baab";
        System.out.println(isSubsequence(s, t));
    }
    //FrustredCode
    public static boolean isSubsequence(String s, String t) {
        int count = 0;

        for (int i = 0, j= s.length()-1; i < s.length(); i++, j--) {

            if (s.length() >= 0 && s.length() <= 100 && t.length() >= 0 && t.length() <= 10000) {
                if (t.contains(String.valueOf(s.charAt(i))) && t.indexOf(s.charAt(i)) >= i) {
                    if ((i < (s.length() - 1) && t.contains(String.valueOf(s.charAt(i + 1)))
                            && t.indexOf(s.charAt(i + 1)) > t.indexOf(s.charAt(i))) || s.length() -1 == i) {
                        count += 1;
                    }
                }
            }

        }
        if (count == s.length()) {
            return true;
        }
        return false;
    }

}
