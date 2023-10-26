package programmers;

import java.util.Arrays;

public class Solution09 {

    public int solution(int n){

        int answer = 0;

        // 3진법 문자열로 변경
        String str = Integer.toString(n, 3);
        // 문자열 뒤집기
        String reversed = new StringBuilder(str).reverse().toString();
        // 뒤집은 문자열 10진법 정수로 변환
        answer = Integer.valueOf(reversed, 3);


        System.out.println("answer : " + answer);
        return answer;
    }
}
