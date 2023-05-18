package bulvee.com.tests.isomorphicstrings;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        //String s = "\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&\'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&\'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&\'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&\'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&\'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&\'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&\'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&\'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&\'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&\'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABC...";
        //String t = "\"\\\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h\'()*+,-./:;<=> @[\\\\]^_`{|}~?\\\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h\'()*+,-./:;<=> @[\\\\]^_`{|}~?\\\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h\'()*+,-./:;<=> @[\\\\]^_`{|}~?\\\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h\'()*+,-./:;<=> @[\\\\]^_`{|}~?\\\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h\'()*+,-./:;<=> @[\\\\]^_`{|}~?\\\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h\'()*+,-./:;<=> @[\\\\]^_`{|}~?\\\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h\'()*+,-./:;<=> @[\\\\]^_`{|}~?\\\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h\'()*+,-./:;<=> @[\\\\]^_`{|}~?\\\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h\'()*+,-./:;<=> @[\\\\]^_`{|}~?\\\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h\'()*+,-./:;<=> @[\\\\]^_`{|}~?\\\"bcdefg&ijklmnopqrstuvwxyzAB...";
        String s = "foo";
        String t = "dei";
        System.out.println(isIsomorphic(s, t));
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<String, String> mapLetters = new HashMap<>();
        HashMap<String, String> mapLettersInverse = new HashMap<>();
        String[] sLetters = s.split("");
        String[] tLetters = t.split("");

        if (s.length() == t.length() && (s.length() >= 1 && s.length() <= 10000)) {
            for (int i = 0, j = 0; i < s.length(); i++, j++) {
                if (mapLetters.get(sLetters[i]) == null) {
                    mapLetters.put(sLetters[i], tLetters[i]);
                }
                if (mapLettersInverse.get(tLetters[j]) == null) {
                    mapLettersInverse.put(tLetters[j], sLetters[j]);
                }
            }
            for (int i = 0; i < sLetters.length; i++) {
                if (mapLetters.get(sLetters[i]) == null
                || !mapLetters.get(sLetters[i]).equals(tLetters[i])
                || !mapLettersInverse.get(tLetters[i]).equals(sLetters[i])) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
