package baekjun;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드 {

    // 1, 2, 3, 4 -> 3, 4, 2 -> 2, 4 -> 4

    // 1, 2, 3, 4, 5, 6 -> 3, 4, 5, 6, 2 -> 5, 6, 2, 4 -> 2, 4, 6 -> 6, 4 -> 4
    // 큐의 선입선출

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        Queue<Integer> myQueue = new LinkedList<>();
        int N = sc.nextInt();
        for(int i = 1; i <= N; i ++){
            myQueue.add(i);

        }
        while(myQueue.size() > 1) {
            myQueue.poll();
            myQueue.add(myQueue.poll());

        }
        System.out.println(myQueue.poll());
        sc.close();
    }
}
