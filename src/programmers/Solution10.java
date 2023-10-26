package programmers;

public class Solution10 {
    public int[] solution(String s) {

        // s의 모든 0 제거
        // s의 길이 c, c를 2진법으로 표현한 문자열로 바꿈
        // "0111010" -> "1111" -> "100"

        // 문자열 s가 "1"이 될때까지 s에 이진변환 횟수, 제거된 0의 개수 배열에 담기
        int count = 0;
        int removed = 0;

        while(!s.equals("1")){
            count++;
            removed += countZeoroes(s);
            String removedZero = s.replace("0","");
            int c = removedZero.length();
            s = Integer.toString(c, 2);
        }

        return new int[]{count, removed};

    }
    private int countZeoroes(String s){
        int zeroes = 0;
        for(char c : s.toCharArray()){
            if(c == '0'){
                zeroes++;
            }
        }
        return zeroes;
    }


    public Solution10() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
