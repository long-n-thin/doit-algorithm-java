class Min4 {
    public static void main(String[] args) {
        System.out.println(min4(30, 5, 20, 9));
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;

        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;
        
        return min;
    }
}
