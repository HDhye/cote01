package baekjun;

import java.util.Scanner;

public class P2018_자연수합 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int p1 = 1;
        int p2 = 1;
        int count = 1;
        int sum = 1;

        while(p2 != N){
            if(sum == N){
                count++;
                p2++;
                sum += p2;
            } else if (sum > N){
                sum -= p1;
                p1++;
            } else {
                sum += p2;
                p2++;
            }
        }
        System.out.println("count = " + count);
        sc.close();
    }
}
