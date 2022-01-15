import java.util.Random;
import java.util.Scanner;

public class Basic_datastructure {

    public Basic_datastructure() {

        //q2();
        //System.out.println(sumOf(createIntRandomArray()));;
        //copy(createIntRandomArray(), createIntRandomArray());
        //rcopy(createIntRandomArray(), createIntRandomArray());
        //cardconv(59,16,new char[10]);
        //System.out.println(dayOfYear(2022, 1, 15));
        //System.out.println(leftDayOfYear(2022, 11, 29));

        //q7();
        //q10();
        q11();
    }

    /**
     * q1
     */
    private void q1() {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("find max value");
        System.out.println("number of person");

        int num = 1 + rand.nextInt(5); // 0~n-1

        int[] height = new int[num];

        System.out.println("---------------------------");
        for(int i =0 ; i<num ; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]" + height[i]);
        }
        System.out.println("max value is " + MaxOfArrayRand.maxOf(height));
    }

    /**
     * p2
     */
    private void q2() {
        int[] arr = new int[ 1+ new Random().nextInt(6)];
        for(int i=0 ; i<arr.length ; i++) {
            arr[i] = -5 + new Random().nextInt(10);
        }
        int tmp = -1;
        arrayPrint(arr);
        for(int i=0 ; i<arr.length/2 ; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = tmp;
        }
        arrayPrint(arr);

    }

    /**
     * q3
     * @return
     */
    private int sumOf(int[] a) {
        int sum = 0;
        arrayPrint(a);
        for(int i=0 ; i<a.length ; i++) {
            sum += a[i];
        }
        return sum;
    }

    /**
     * q4
     *
     * @param b
     */
    private void copy(int[] a, int[] b) {
        // a := b
        if(a == null || b == null) {
            //exception
        }
        if(b.length < 1) {
            //exception
        }

        a = new int[b.length];
        for(int i=0 ; i<b.length ; i++) {
            a[i] = b[i];
        }
        System.out.println("a copy b");
        arrayPrint(b);
        arrayPrint(a);
    }

    /**
     * q5
     *
     * @param a
     * @param b
     */
    private void rcopy(int[] a, int[] b ) {
        // a := reverse b
        if(a == null || b == null) {
            //exception
        }
        if(b.length < 1) {
            //exception
        }

        a = new int[b.length];
        for(int i=0 ; i<b.length; i++) {
            a[i] = b[b.length-1 -i];
        }
        System.out.println("a reverse copy b");
        arrayPrint(b);
        arrayPrint(a);
    }

    /**
     * q6
     *
     * @param x
     * @param r
     * @param d
     * @return
     */
    private int cardconv(int x, int r, char[] d) {

        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char tmp = ' ';
        int dCnt = 0;

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
            dCnt++;
        } while( x!=0);

        arrayPrint(d);
        for(int i=0 ; i<dCnt/2 ; i++) {
            tmp = d[i];
            d[i] = d[dCnt -1 -i];
            d[dCnt -1 -i] = tmp;
        }
        arrayPrint(d);
        return digits;
    }

    /**
     * q7
     *
     */
    private void q7() {
        System.out.println("10진수를 기수 변환합니다.");
        System.out.print("변환하는 음이 아닌 정수 :");
        int x = new Scanner(System.in).nextInt();
        System.out.println();
        System.out.print("어떤 진수로 변환할까요?(2~36) : ");
        int r = new Scanner(System.in).nextInt();
        System.out.println();

        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char tmp = ' ';
        int dCnt = 0;
        char[] d = new char[10];

        System.out.printf("%d%s",r , "|");
        System.out.printf("%5d\n", x);
        System.out.printf("%s\n","  +----------");

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;

            if(x > 0)   System.out.print(r + "|");
            System.out.printf("%5d%4s%s\n", x, "...", d.length>0 ? d[digits-1] : 0);
            if(x > 0) System.out.printf("%s\n","  +----------");

            dCnt++;
        } while( x!=0);


        for(int i=0 ; i<dCnt/2 ; i++) {
            tmp = d[i];
            d[i] = d[dCnt -1 -i];
            d[dCnt -1 -i] = tmp;
        }
        System.out.printf("%d진수로 %s입니다.", r, String.copyValueOf(d));
    }


    /**
     * q8
     */
    private int dayOfYear(int y, int m, int d) {

        // 실제 월(1~12), 배열(0~11) -> m-1
        // 현재월 제외 -> m-1
        while(m > 1) {
            d += DayOfYear.mdays[DayOfYear.isLeap(y)][-1 + (m-- -1)];
        }

        return d;
    }

    /**
     * q9
     *
     * @param y
     * @param m
     * @param d
     * @return
     */
    private int leftDayOfYear(int y, int m, int d) {
        // 실제 월(1~12), 배열(0~11) -> m-1
        // 현재월 제외 -> m+1

        //현재월 남은 일자 계산
        d = DayOfYear.mdays[DayOfYear.isLeap(y)][-1 + m] - d;

        //현재월 제외 남은 일자 계산
        while(m < 12) {
            d += DayOfYear.mdays[DayOfYear.isLeap(y)][-1 + (m++ +1)];
        }

        return d;
    }

    /**
     * q10
     */
    private void q10() {
        new PhysicalExamination();
    }

    private void q11() {
        System.out.println(new YMD(2020,12,15).after(365).toString());;
        System.out.println(new YMD(2022,1,15).before(365).toString());;
    }

    /**
     * int array print
     * @param arr
     */
    private void arrayPrint(int[] arr) {
        for(int i=0 ; i<arr.length ; i++)  {
            System.out.printf("%3d",arr[i]);
        }
        System.out.println();
    }

    /**
     * char array print
     * @param arr
     */
    private void arrayPrint(char[] arr) {
        for(int i=0 ; i<arr.length ; i++)  {
            System.out.printf("%3s",arr[i]);
        }
        System.out.println();
    }

    private int[] createIntRandomArray() {
        int[] arr = new int[ 1+ new Random().nextInt(6)];
        for(int i=0 ; i<arr.length ; i++) {
            arr[i] = -5 + new Random().nextInt(10);
        }
        return arr;
    }
}



class MaxOfArrayRand {
    static int maxOf(int[] a) {
        int max = a[0];
        for(int i=0 ; i<a.length ; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }
}

class DayOfYear {
    static int[][] mdays = {
        {31,28,31,30,31,30,31,31,30,31,30,31},
        {31,29,31,30,31,30,31,31,30,31,30,31}
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) ? 1 : 0;
    }


}


/**
 * 02-2 class
 * q10
 */
class PhysicalExamination {
    static final int VMAX = 21;

    static {
        System.out.println("wegawegawegawge");
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("kim1", 162, 0.3),
                new PhyscData("kim2", 173, 0.7),
                new PhyscData("kim3", 193, 2.0),
                new PhyscData("kim4", 171, 0.1),
                new PhyscData("kim5", 155, 0.2),
                new PhyscData("kim6", 188, 0.2),
                new PhyscData("kim7", 182, 0.8),
        };
        int[] vdist = new int[VMAX];
        String[] vdistToStar = new String[VMAX];
        for(int i=0 ; i<vdistToStar.length ; i++) {
            vdistToStar[i] = "";
        }

        System.out.println("phycical examination");
        System.out.println("name    height vision");
        System.out.println("============================");
        for(int i=0 ; i< x.length ; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

        }
        System.out.printf("\naveHeight : %5.1fcm\n", aveHeight(x));

        //distVision(x, vdist);
        distVisionToStar(x, vdistToStar);

        System.out.println("\nvision distribution");
        for(int i=0 ; i<VMAX ; i++) {
           System.out.printf("%3.1f~ : %2s\n", i/10.0, vdistToStar[i]);
        }

    }
    static class PhyscData {
        String name;
        int height;
        double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(PhyscData[] data) {
        double sum = 0;

        for(int i=0 ;i< data.length ; i++) {
            sum += data[i].height;
        }
        return sum/data.length;
    }

    static void distVision(PhyscData[] data, int[] dist) {
        int i=0 ;
        dist[i] = 0;
        for(i=0 ;i<data.length ; i++) {
            if(data[i].vision >= 0.0 && data[i].vision <= VMAX /10.0)
                dist[(int)(data[i].vision * 10)]++;
        }
    }

    static void distVisionToStar(PhyscData[] data, String[] dist) {

        for(int i=0 ;i<data.length ; i++) {
            if(data[i].vision >= 0.0 && data[i].vision <= VMAX /10.0) {
                dist[(int)(data[i].vision * 10)] += "*";
            }
        }
    }
}


class YMD {
    int y;
    int m;
    int d;

    public YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    public YMD after(int n) {
        d += n;
        while(d > DayOfYear.mdays[DayOfYear.isLeap(y)][m-1]) {
            d = d - DayOfYear.mdays[DayOfYear.isLeap(y)][m-1];
            if(m < 12) {
                m++;
            } else {
                y++;
                m = 1;
            }
        }

        return this;
    }
    public YMD before(int n) {

        int tmpDay = 0;
        if(n >= d) {
            d = n-d;
            if((m-1) < 1) {
                y = y-1;
                m = 12;
            } else {
                m = m-1;
            }
            do {
                tmpDay = DayOfYear.mdays[DayOfYear.isLeap(y)][m-1];
                if(d >= tmpDay) {
                    d = d-tmpDay;
                    if((m-1) < 1) {
                        y = y-1;
                        m = 12;
                    } else {
                        m = m-1;
                    }
                } else {
                    d = tmpDay-d;
                    break;
                }

            } while(true);

        } else {
            d = d-n;
        }
        return this;
    }

    @Override
    public String toString() {
        return "YMD{" +
                "y=" + y +
                ", m=" + m +
                ", d=" + d +
                '}';
    }
}