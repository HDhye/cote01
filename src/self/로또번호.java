package self;

import java.util.*;
import java.util.stream.Collectors;

public class 로또번호 {


    private int lottoSize;

    public 로또번호(int size) {


        // 시간복잡도 O(log n)
        Set<Integer> lotto = new TreeSet<>();

        int i = 0;
        while(lotto.size() < size){

            lotto.add((int)(Math.random()*45)+1);

        }
        System.out.println("lotto = " + lotto);

    }

    public static void main(String[] args) {

        로또번호 lotto = new 로또번호(6);
    }
}
