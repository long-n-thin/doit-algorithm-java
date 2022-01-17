package kimin.ch02;

class Clone2DArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = a.clone();

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println();
        
        int[][] c = {{1,2,3,4}, {5,6,7}};
        int[][] d = c.clone();
        
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println();
        System.out.println("c[0]: " + c[0]);
        System.out.println("d[0]: " + d[0]);
    }
}
