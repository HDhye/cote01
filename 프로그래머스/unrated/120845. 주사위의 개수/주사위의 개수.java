import java.util.*;

class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        int dice = (int) Math.pow(n, 3);
        
        for(int b : box){
            answer *= diceCheck(b, n);
        }
           
        return answer;
    }
    
    static private int diceCheck(int boxlen, int n){
        int count = 0; 
        while(n <= boxlen){
            boxlen -= n; 
            count++; 
        }
        System.out.println(count);

        return count;
    }
}