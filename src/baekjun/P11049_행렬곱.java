package baekjun;

import java.util.Scanner;

// DP 점화식
public class P11049_행렬곱 {

    /*
    *  N x M = A
    *  M x K = B
    *  연산횟수는 N x M x K
    *
    * */
    static int N;   // 행렬 갯수
    static Matrix[] M;  // 행렬 저장 클래스 배열
    static int[][] D;   // i ~ j 번째 행렬까지 최소연산 횟수를 저장하는 배열

    static class Matrix {
        private int y;  // 열의 갯수
        private int x;  // 행의 갯수
        Matrix(int y, int x){
            this.y = y;
            this.x = x;
        }

    }

    public static void main(String[] args) {

        // 점화식
        // 3 - 5 3 , 3 2, 2 6
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = new Matrix[N+1];
        D = new int[N+1][N+1]; // 1부터 시작하므로 인덱스는 +1씩 해줌

        // -1 로 초기화
        for(int i =0; i < D.length; i++){
            for(int j =0; j < D[i].length; j++){
                D[i][j] = -1;
            }
        }

        // 행렬 데이터 저장하기
        for(int i = 1; i <= N; i++){
            int y = sc.nextInt();
            int x = sc.nextInt();
            M[i] = new Matrix(y, x);
        }

        // excute () 1 ~ N 까지 모두 곱했을 때 연산최소값 리턴
        System.out.println(excute(1, N));



    }

    static int excute(int s, int e) { // start ~ end

        int result = Integer.MAX_VALUE; // integer 제일 큰 수로 초기화 하기
        // 이미 계산한 구간일 때
        if(D[s][e] != -1 ) {
            return D[s][e]; // 이미 계산되어있으면 바로 리턴(시간복잡도 줄이기)
        }
        // 행렬 1개일 때
        if(s == e){
            return 0;
        }
        // 행렬 2개일 때
        if(s+1 == e) {  // 시작과 종료 갯수가 1개 차이일 때
            return M[s].y * M[s].x * M[e].x;        // 앞의 행렬에 첫번째 칸 * 앞의 행렬에 두번째 칸 * 뒤 행렬의 두번째 칸
        }

        // 행렬 3개 이상일 때
        for(int i = s; i < e; i++){
            int a = M[s].y * M[s].x * M[e].x;
            result = Math.min(result, a);
        }

        return D[s][e] = result;
    }

    // 행렬저장 클래스 배열

}
