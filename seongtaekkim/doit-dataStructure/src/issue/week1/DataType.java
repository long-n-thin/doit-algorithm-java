package issue.week1;

public class DataType {

    public static void main(String[] args) {
        /*int[] arr = null;
        System.out.println(arr[0]);*/

       /* Integer[] arr2 = null;
        System.out.println(arr2);*/

        // new Sample();

        int int1;
        Integer int2 = null;
        Integer[] intArr = null;
        //System.out.println(int2.BYTES);

        Integer data1 = 100;
        String data2 = "data";
        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기



        for(int i=0 ; i<1000000000 ; i++) {
            function1(data1);
            function1(data2);
        }
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
        System.out.println("secDiffTime : " + secDiffTime);

    }

    public static void function1(Object data) {
        if(data instanceof Integer) {
        } else if(data instanceof String) {
        }
    }

/*
    public static void function1(int data) {
    }
    public static void function1(String data) {
    }*/



}

class Sample {
    static int total = 0;
    public Sample() {
        String str1 = "test";
        String str2 = "test";
        String str3 = new String("test");
        String str4 = new String("test");

        int num1 = 10;
        int num2 = 20;
        int num3;

        num3 = add(num1, num2);

    }

    public int add(int t1, int t2){
        total++;
        return (t1+t2);
    }

}