class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        
        String[] arr = n_str.split("^0*");
        
        for(String s : arr){
            answer += s;
        }
        
        return answer;
    }
}