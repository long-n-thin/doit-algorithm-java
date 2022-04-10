package ch08;

public class Main {
    public static void main(String[] args) {
        BruteForce bf = new BruteForce();
        KMP kmp = new KMP();
        BoyerMoore bm = new BoyerMoore();

        String s = "ABCxyzDEFxyz";
        String pattern = "xyz";
        int bfIndex = bf.search(s, pattern);
        int kmpIndex = kmp.search(s, pattern);
        int bmIndex = bm.search(s, pattern);

        printStringSearchResult(s, pattern, bfIndex);
        printStringSearchResult(s, pattern, kmpIndex);
        printStringSearchResult(s, pattern, bmIndex);
    }

    static void printStringSearchResult(String s, String pattern, int index) {
        if (index == -1) {
            System.out.println("일치하는 패턴 없음");
        } else {
            int len = 0;
            for (int i = 0; i < index; i++) {
                len += s.substring(i, i + 1).getBytes().length;
            }
            len += pattern.length();

            System.out.println((index + 1) + "번째 문자부터 일치함");
            System.out.println("txt: " + s);
            System.out.printf(String.format("pat: %%%ds\n", len), pattern);
        }
    }
}
