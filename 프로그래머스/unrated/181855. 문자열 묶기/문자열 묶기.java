import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        answer = IntStream.range(0, 31).map(i -> (int) Arrays.stream(strArr)
                                   .filter(j -> j.length() == i).count()).max().orElse(0);
        return answer;
    }
}