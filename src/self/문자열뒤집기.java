package self;

public class 문자열뒤집기 {
    // "가나다라마바사아자차카타파하" 뒤집기

    public static void main(String[] args) {

        String str = "가나다라마바사아자차카타파하";
        String reverse = "";

        for (int i = str.length() - 1 ; i >= 0; i--) {

            char c = str.charAt(i);
            reverse += c;

        }

        System.out.println("reverse = " + reverse);
    }
}
