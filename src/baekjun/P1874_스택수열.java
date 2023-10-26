package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class P1874_스택수열 {

    // 2초
    // N = 8
    // A[] = 4 3 6 8 7 5 2 1
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); // 재료 갯수
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int num = 1;
        for(int i =0; i < A.length; i++){
                if (num <= A[i]) {
                    while(num <= A[i]) {
                        stack.push(num++);
                        sb.append("+\n");
                    }
                } else
                    stack.pop();
                    sb.append("-\n");
            }
        System.out.println("sb = " + sb);
        bf.close();
        }

    }


