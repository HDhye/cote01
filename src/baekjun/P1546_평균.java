package baekjun;

import java.util.Arrays;
import java.util.Collections;

public class P1546_평균 {
    public static void main(String[] args) {

        // 2초 브론즈

        // 1 <= N <= 1000
        // 0 <= point <= 100
        // 0 < M <= 100
        int test1[] = {40, 80, 60};
        int test2[] = {10, 20, 30};
        int test3[] = {1, 100, 100, 100};
        int test4[] = {1, 2, 4, 8 ,16};
        int test5[] = {3, 10};
        int sub1 = test1.length;
        int sub2 = test2.length;
        int sub3 = test3.length;
        int sub4 = test4.length;
        int sub5 = test5.length;

        long sum = 0;
        long max = 0;


        for(int i =0; i < sub2; i++){
            if(test2[i] > max) {
                max = test2[i];
            }
            sum += test2[i];
        }
        System.out.println("max = " + max);

        System.out.println("measure = " + sum*100.0/max/sub2);


    }






}
