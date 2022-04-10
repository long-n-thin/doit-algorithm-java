package ch08;

public class KMP {
    public int search(String txt, String pattern) {
        int pt = 1;
        int pp = 0;
        int[] skip = new int[pattern.length() + 1];

        skip[pt] = 0;
        while (pt != pattern.length()) {
            if (pattern.charAt(pt) == pattern.charAt(pp)) {
                skip[++pt] = ++pp;
            } else if (pp == 0) {
                skip[++pt] = pp;
            } else {
                pp = skip[pp];
            }
        }

        pt = pp = 0;
        while (pt != txt.length() && pp != pattern.length()) {
            if (txt.charAt(pt) == pattern.charAt(pp)) {
                pt++;
                pp++;
            } else if (pp == 0) {
                pt++;
            } else {
                pp = skip[pp];
            }
        }

        if (pp == pattern.length()) return pt - pp;

        return -1;
    }
}
