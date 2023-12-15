import java.util.*; 

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
                
        Arrays.fill(answer, -1);
        int[] newArr = Arrays.stream(arr).distinct().toArray();
        
        answer[0] = newArr[0];
        int count = 1; 
        // 5 4321
        for(int i = 1; i < newArr.length; i++){

            if(count == k){
               break;
            }
            else if(newArr[i] != newArr[i-1]){
                answer[count] = newArr[i];
                count++; 
            }      
        }
        return answer;
    }
}