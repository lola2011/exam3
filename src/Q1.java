import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rnd = new Random();
        Integer a = 0;
        for (int i = 0; i < 100; i++) {
            a = rnd.nextInt(100);
numbers.add(a);
        }        System.out.println(numbers);
        LinkedHashSet<Integer> myHasHSet = new LinkedHashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (a % 2 == 0 && a % 5 == 0) {
                myHasHSet.add(a);
            }
            System.out.println(myHasHSet);

        }for (int i = 0; i < numbers.size(); i++) {
                myHasHSet.add(a);
            }
            System.out.println(myHasHSet);



    }}

