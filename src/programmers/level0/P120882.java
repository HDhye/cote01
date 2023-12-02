package programmers.level0;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 등수매기기 https://school.programmers.co.kr/learn/courses/30/lessons/120882
public class P120882 {

    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        // 인덱스, 평균점수
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < score.length; i++) {
            int sum = 0;

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }

            int average = sum / score[i].length; // Calculate the average correctly
            answer[i] = average;
            map.put(i, average);

            System.out.print(" ," + answer[i]);
        }

        System.out.println();

        int rank = score.length;
        Stream<Map.Entry<Integer, Integer>> entryMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue());

        return answer;
    }

    public static void main(String[] args) {

        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        int[] answer = new P120882().solution(score);
    }
}
