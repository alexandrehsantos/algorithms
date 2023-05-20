package bulvee.com.tests.issubsequence;

public class IsSubsequenceBetter {


    public static void main(String[] args) {
        String s = "code";
        String t = "csdfasdfsadfocvcvadfasfdvvvvvvvvvvvvvvvvvvvvvvve";
        System.out.println(isSubsequence(s, t));

    }

    public static boolean isSubsequence(String s, String t) {
        int leftBound = s.length(), rightBound = t.length();
        int pLeft = 0, pRight =0;

        while(pLeft < leftBound && pRight < rightBound){
            if(s.charAt(pLeft) == t.charAt(pRight)){
                pLeft += 1;
            }
            pRight += 1;
        }
        return pLeft == leftBound;
    }
}
