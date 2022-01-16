class Max4 {
    public static void main(String[] args) {
        System.out.println(max4(1, 2, 3, 4));
    }

    static int max4(int a, int b, int c, int d) {
        int max = a;

        if (max < b) max = b;
        if (max < c) max = c;
        if (max < d) max = d;

        return max;
    }
}
