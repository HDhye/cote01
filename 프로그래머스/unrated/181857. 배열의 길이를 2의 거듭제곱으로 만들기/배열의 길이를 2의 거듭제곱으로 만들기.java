import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        int answerLength =(int) Math.pow(2, Math.ceil(Math.log(arr.length)/Math.log(2)));
        int[] answer = new int[answerLength];
        
        for(int i = 0; i < arr.length; i++){
            
            answer[i] = arr[i];
        }
        
        
        
        return answer;
    }
}