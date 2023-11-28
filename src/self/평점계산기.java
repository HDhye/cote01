package self;

public class 평점계산기 {
    /*
    *
    - 심사위원 10명이 각 0-100 사이의 자연수로 평가 점수를 제출합니다. 10개의 평가 점수를 담은 배열 A가 주어지면 다음과 같은 조건으로 평점을 계산하고 계산된 평점 SCORE를 리턴
    - 10개의 평점 중 최고점, 최저점은 제외
    - 최고/최저점이 제외된 점수의 평균을 계산하고 소수점 첫 번째 자리에서 반올림하면 평점이 산출됨
    - A = [ 50, 50, 10, 50, 50, 100, 50, 50, 50, 50 ]
    - 최저점 10, 최고점 100을 제외하고 평균값은 50
    - Score = 50
    * */

    public static void main(String[] args) {

        int[] A = { 50, 50, 10, 50, 50, 95, 50, 50, 50, 50 };

        int max = A[0];
        int min = A[0];
        int sum = 0;
        int avg = 0;
                
        for(int i = 0 ; i < A.length; i++){

            max = Math.max(A[i], max);
            min = Math.min(A[i], min);
            sum += A[i];
        }
        avg = (sum - min - max) / (A.length - 2);
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);




    }


}
