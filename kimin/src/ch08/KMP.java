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

    public void search2(String txt, String pattern) {
        int[] table = makeTable(pattern);
        int tlen = txt.length();
        int plen = pattern.length();
        int j = 0;

        for (int i = 0; i < tlen; i++) {
            while (j > 0 && txt.charAt(i) != pattern.charAt(j)) {
                j = table[j - 1];
            }
            if (txt.charAt(i) == pattern.charAt(j)) {
                if (j == plen - 1) {
                    System.out.println(i - plen + 2 + "에서 찾음");
                    j = table[j];
                } else {
                    j++;
                }
            }
        }
    }

    private int[] makeTable(String pattern) {
        int[] table = new int[pattern.length()];
        int j = 0;

        for (int i = 1; i < pattern.length(); i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = table[j - 1];
            }

            if (pattern.charAt(i) == pattern.charAt(j)) {
                table[i] = ++j;
            }
        }

        return table;
    }
}
