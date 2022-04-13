package ch08;

public class BruteForce {
    public int search(String s, String pattern) {
        int pt = 0;
        int pp = 0;

        while (pt != s.length() && pp != pattern.length()) {
            if (s.charAt(pt) == pattern.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1;
                pp = 0;
            }
        }
        if (pp == pattern.length()) {
            return pt - pp;
        } 

        return -1;
    }
}
