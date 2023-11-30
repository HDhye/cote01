package programmers.level0;

import java.util.*;
import java.util.stream.Collectors;

// 등수매기기 https://school.programmers.co.kr/learn/courses/30/lessons/120882
public class P120882 {

    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        answer[0] = 1;

        // 인덱스, 평균점수
        List<Map.Entry<Integer, Integer>> avgList = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < score.length;  i++){

            int sum = 0;

            for(int j = 0; j < score[i].length; j++){

                sum += score[i][j];

            }
            answer[i] = sum/2;
            map.put(i, sum/2); // 중복 업데이트로 마지막 인덱스만 값에 담김

            System.out.print(" ," + answer[i]);
        }

        System.out.println();
        int rank = score.length;

        avgList = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());

        System.out.println("avgList = " + avgList);

        for (int i = 0; i < avgList.size(); i++) {

//            answer[i] = avgList.get(i)
        }
//
//        for (int i = 0; i < answerlist.size(); i++) {
//            answer[map.get(answerlist.get(i))] = rank;
//
//            rank--;
//        }

        return answer;
    }

    public static void main(String[] args) {

        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        int[] answer = new P120882().solution(score);
    }
}
