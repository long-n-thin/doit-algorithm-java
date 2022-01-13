package chap02;

public class test {

    public static void main(String[] args) {

        //같은 자료형의 변수로 이루어진 구성 요소(component)가 모인것
        //int, double, 객체도 가능

        int[] number1 = new int[5];

        int[] number2;
        number2 = new int[5];

        System.out.println("number2.toString() = " + number2.toString());
        System.out.println("number2.length = " + number2.length);


        


    }
}
