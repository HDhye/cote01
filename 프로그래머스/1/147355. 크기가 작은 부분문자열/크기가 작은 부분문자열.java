class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        long[] arr = new long[t.length()-p.length() + 1];
        
        for(int i =0; i < arr.length; i++){
            arr[i] = Long.parseLong(t.substring(i, p.length() + i));
            if(arr[i] <= Long.parseLong(p)){
                answer++;
            }
        }
        
     
        return answer;
    }
}