class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(isSame(arr)){
            for(int i =0; i < arr.length; i++){
            arr[i] = cal(arr[i]); 
            }
            answer++;
        }
            
        return answer -1;
    }
    
    private static int cal(int num){
        if(num >= 50 && num % 2 == 0){
            return num /= 2; 
        } else if(num < 50 && num % 2 != 0){
            return num = num*2 + 1; 
        } return -1;        
    }
    
    private static boolean isSame(int[] arr){
        int count = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] == -1){
                count++; 
            }
        }
        if(count == arr.length){
            return false;
        } 
        return true;
    }
    
    
}