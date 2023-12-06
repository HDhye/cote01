class Solution {
    enum Number { 
    zero, one, two, three, four, five, six, seven, eight, nine;
    }
    
    public long solution(String numbers) {
        
        long answer = 0;
        
        for(Number num : Number.values()){

            numbers = numbers.replaceAll(num.name(), String.valueOf(num.ordinal()));  
            
        }
        answer = Long.parseLong(numbers);

        return answer;
    }
}