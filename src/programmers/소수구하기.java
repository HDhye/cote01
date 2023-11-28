package programmers;

public class 소수구하기 {
    public static void main(String[] args) {

        int n = 2000000123;
        int k = 3;

        // 진법 변환 및 문자열로
        long num = Long.valueOf(n);

        String str = Long.toString(num, k);

        System.out.println("str = " + str);

        // num의 소수 구하기
//        long num = Long.valueOf(str);

        int answer = 0;

        int i = 0;

        w1: while (true) {


            String isPrime = "";

            f1: for (; i < str.length(); i++) {

                char digit = str.charAt(i);
                System.out.println("digit = " + digit);

                if (digit != '0') {
                    isPrime += digit;
                    System.out.println("isPrime = " + isPrime);
                }
                if(digit == '0' || i == str.length() -1 ) {

                    if(isPrime.equals("2")){
                        answer++;
                        break;
                    }
                    else {
                        if(isPrime.equals("")) {
                            i++;
                            break;
                        }
                        else if(isPrime.equals("1")){
//                            i++;
                            break f1;
                        }
                        f2: for (int j = 2; j < Integer.valueOf(isPrime); j++) {
                            if(Integer.valueOf(isPrime) % j == 0 ){
                                isPrime = "";
                                i--;
                                break;
                            } if(j+1 == Integer.valueOf(isPrime)){
                                answer++;
                                break f1;
                            }
                        }
                    }
                }
            }

            System.out.println("answer = " + answer);
            if(i == str.length() -1){
                break w1;
            }
        }

    }
}
