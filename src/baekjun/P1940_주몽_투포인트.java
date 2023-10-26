package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940_주몽_투포인트 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int S = Integer.parseInt(bf.readLine()); // 재료 갯수
        int P = Integer.parseInt(bf.readLine());   // 번호 합
        int[] intArr = new int[S];
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i =0; i < S; i++){
            intArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(intArr);
        int count = 0;
        int i = 0;
        int j = S - 1; 
        
        while(i < j){
            if(intArr[i] + intArr[j] < P){
                i++;
            } else if(intArr[i] + intArr[j] > P){
                j--; 
            } else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println("count = " + count);
        bf.close();
    }
}
