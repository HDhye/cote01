package self;

public class 자연수의합 {
    
    // A와 B사이의 3배수 자연수 합 구하기 
    public static void main(String[] args) {
        
        int a = 178970;
        int b = 2232;
        if(a > b ){
            int tmp = a; 
            a = b;
            b = tmp; 
        }
        
        int sum = 0;
        
        for(int i = a; i <= b; i++){
            
            if(i % 3 == 0){
                sum += i;
            }
        }

        System.out.println("sum = " + sum);
    }
}
