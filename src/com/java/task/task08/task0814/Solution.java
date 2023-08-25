package com.java.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {

    public static HashSet<Integer> createSet() {
        HashSet<Integer> chislo = new HashSet<>();
        for (int i = 0; i<20; i++)
            chislo.add(i);
        return chislo;


    }


    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Integer i = (Integer)iter.next();
            if(i>10)
                iter.remove();
        }

            return set;



    }


    public static void main(String[] args) {



    }
}
