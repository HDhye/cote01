package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_비밀번호 {

    static int myArr[] = new int[4]; // 내 문자열
    static int checkArr[] = new int[4];  // ACGT
    static int checkSecret; // 비밀번호 만족 문자 체크



    // 2초

    /*
    * 문자열의 길이 9, 부분 문자열의 길이 8
    * 문자열 CCTGGATTG
    * ACGT 최소개수 2 0 1 1
    * -> 0
    *
    * 4, 2
    * GATA
    * 1001 - ACGT
    * -> 2
    * */
    // 슬라이드 윈도우, 윈도우 = 2,
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result = 0;
        char A[] = new char[S]; // 문자열

        A = bf.readLine().toCharArray();
        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < 4; i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkSecret++;
            }
        }
        for(int i=0; i<P; i++){  // 부분문자열 처음 받을 때 세팅
            Add(A[i]);
        }

        if(checkSecret == 4) {
            result++;
        }

        // 슬라이딩 윈도우
        for(int i = P; i < S; i++){
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4) result++;
        }

        System.out.println("result = " + result);



        bf.close();
    }

    private static void Remove(char c) {
        switch (c){
            case 'A':
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }


}
