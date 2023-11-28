package self;

public class 자연수의합2 {

    //  n은 100,000,000 이하의 자연수 (1초)
    // n을 자료형 변환해서 사용하지 말것
    // n = 2468 이면, 2 + 4+ 6+ 8 = 20 을 return

    public static void main(String[] args) {
        
        int n = 90129288; 
        // 몫, 나머지 
        int 몫; 
        int 나머지;
        
        int sum = 0; 
        w1: 
            while(true){
                
                몫 = n / 10; 
                sum += n % 10;
                System.out.println("sum = " + sum);
                n = 몫;
                System.out.println("n = " + n);
                if(n <= 0){
                    break; 
                }
            }
//        System.out.println("sum = " + sum);
    }
    
    
    
}
