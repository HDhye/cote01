package programmers.level0;

public class P181832 {

    private static int x = 0;
    private static int y = 0;
    public static void main(String[] args) {
        /*
        양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
        * */

        int n = 4;

        int[][] answer = new int[n][n];

        for (int i = 1; i <= n * n; i++) {

            answer[x][y] = i;
            System.out.printf("answer[%d][%d] = %d\t", y, x, answer[y][x]);

            if (x + 1 < n && answer[y][x + 1] == 0) {
                right();
            } else if(x - 1 >= 0 && answer[y][x-1] == 0){
                left();
            } else if(y + 1 < n && answer[y + 1][x] == 0){
                down();
            } else if(y -1 >= 0 && answer[y -1][x] == 0){
                up();
            }

        }
    }

    private static void right() {
        x++;
    }

    private static void left() {
        x--;
    }

    private static void up() {
        y--;
    }

    private static void down() {
        y++;
    }

}
