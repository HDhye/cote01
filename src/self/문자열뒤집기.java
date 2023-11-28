package self;

public class 문자열뒤집기 {
    // "가나다라마바사아자차카타파하" 뒤집기

    public static void main(String[] args) {

        // 공백 제거 후 문자열 뒤집기
        String str = "가나다라 마바사 - 아자차-카 타파%하";
        String str2 = str.replaceAll("[-%\\s]+", "");

        // 스트링빌더로 사용해보기
        StringBuilder answer = new StringBuilder(str2).reverse();
        answer.toString();

//        for (int i = str2.length() - 1 ; i >= 0; i--) {
//            char c = str2.charAt(i);
//            answer += c;

        System.out.println("reverse = " + answer);

    }
}
