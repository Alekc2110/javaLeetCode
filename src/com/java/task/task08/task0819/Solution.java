package com.java.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> rem = cats.iterator();
        Cat ca = rem.next();
        cats.remove(ca);



        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat i: cats)
            {
                System.out.println(i);

        }
    }

    // step 1 - пункт 1
    public static class Cat  {

        public  Cat(){
        }
    }
}
