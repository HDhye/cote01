package self;


public class 배열합치기 {

    /*
    - 임의의 알파벳 대문자를 담은 무작위 길이의 배열 A, B와 각 배열의 길이 A_len, B_len이 주어지면 다음과 같은 조건으로 두 배열을 병합하고 합쳐진 새로운 배열 C를 리턴하는 함수
    - A의 데이터는 순서대로 C의 0, 2, 4, … 번 인덱스에 삽입됩니다.
    - B의 데이터는 순서대로 C의 1, 3, 5, … 번 인덱스에 삽입됩니다.
    - B의 데이터를 모두 삽입해도 A의 데이터가 모두 삽입되지 않았을ㄹ 경우 다시 B의 첫번째 데이터부터 삽입된다.
    - A의 데이터가 모두 삽입된 경우 이에 대응하는 B의 데이터까지 모두 삽입해야 병합이 완료된다.
    - A_len ≥ B_len
    - A_len < B_len * 2
    - 0 < A_len , B_len < 100
    */
    public static void main(String[] args) {

        char[] A = {'A', 'B', 'E', 'X', 'Y'};
        char[] B = {'Z', 'I', 'L'};

        int a = 0;
        int b = 0;

        char[] C = new char[A.length * 2 -1 ];

        for(int i = 0; i < C.length; i++){
            System.out.println("i = " + i);
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            if( b >= B.length) {
                b = 0;
            }
            if(i % 2 == 0){
                C[i] = A[a++];
            }
            else {
                C[i] = B[b++];
            }
        }

        for (int i = 0; i < C.length; i++) {
            System.out.print(" " + C[i]);

        }

    }
}
