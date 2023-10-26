package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P11286_절대값힙 {


    // 18
    // 1 -1 0 0 0 1 1 -1 -1 2 -2 0 0 0 0 0 0 0
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); // 재료 갯수
        PriorityQueue<Integer> myQueue = new PriorityQueue<>(((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            // 절대값이 같은 경우 음수 우선
            if (first_abs == second_abs) {
                return o1 > o2 ? 1 : -1;
            }
            // 절대값 작은 데이터 우선
            return first_abs - second_abs;
        }));

        StringBuilder sb = new StringBuilder();


        // N(O)
        for (int i = 0; i < N; i++) {
            int request = Integer.parseInt(bf.readLine());
            if (request == 0) {
                if (myQueue.isEmpty()) {
                    sb.append("0\n");
                } else {
                    sb.append(myQueue.poll());
                }
            } else {
                myQueue.add(request);
            }
        }
    }
}
