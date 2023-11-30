package programmers.level0;

// 캐릭터의 좌표 https://school.programmers.co.kr/learn/courses/30/lessons/120861
public class P120861 {

    private static int x = 0;
    private static int y = 0;

    private static void up(){
        y++;
        System.out.println("up--");
    }
    private static void down(){
        y--;
        System.out.println("down--");

    }
    private static void left(){
        x--;
        System.out.println("left--");

    }
    private static void right(){
        x++;
        System.out.println("right--");

    }

    public int[] solution(String[] keyinput, int[] board) {

        int[] answer = new int[2];
        // x, y지점 가운데로 인덱스 초기화
        int x1 = (int) (board[0] / 2);
        int y1 = (int) (board[1] / 2);

        x = x1;
        y = y1;

        // 가로세로 길이
        int horizon = board[0];
        int vertical = board[1];

        System.out.println("x1 = " + x);
        System.out.println("y1 = " + y);
        for(String key : keyinput){

            if(key.equals("up") && vertical - 1 > y){
                up();
            } else if(key.equals("down") && 0 < y){
                down();
            } else if(key.equals("left") && 0 < x){
                left();
            } else if(key.equals("right") && horizon - 1 > x){
                right();
            }
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
        answer[0] = x - x1;
        answer[1] = y - y1;

        System.out.println("xE = " +  answer[0]);
        System.out.println("yE = " + answer[1]);

        return answer;
    }

    public static void main(String[] args) {

        int[] board = {3, 1};
        String[] keyinput = {"left", "right", "up", "down", "right"};
        
        int[] answer = new P120861().solution(keyinput, board);

    }

}
