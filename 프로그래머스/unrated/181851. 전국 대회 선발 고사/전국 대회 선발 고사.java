import java.util.stream.Collectors;
import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();  // rank, index 
        
        for(int i =0; i < rank.length; i++){
            if(attendance[i]){
                map.put(rank[i], i);
            }
        }
        
        List<Integer> sortedList = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        answer = sortedList.get(0) * 10000 +
                 sortedList.get(1) * 100 +
                 sortedList.get(2);
            
        
        return answer;
    }
}