package kkambo.chap02;

public class int2DarrayClone {

    public static void main(String[] args) {
        
        int[][] a = {{1, 2, 3, 4}, {5,6,7}};
        int[][] b = a.clone();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("====================");
        System.out.println("a[0] = " + a[0]);
        System.out.println("b[0] = " + b[0]);

        System.out.println("====================");
        System.out.println("a[1] = " + a[1]);
        System.out.println("b[1] = " + b[1]);


    }
    
    
    
}
