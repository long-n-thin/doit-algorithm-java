class Min3 {
    public static void main(String[] args) {
        System.out.println(min3(3, 60, 12));
    }

    static int min3(int a, int b, int c) {
        int min = a;

        if (min > b) min = b;
        if (min > c) min = c;
        
        return min;
    }
}
