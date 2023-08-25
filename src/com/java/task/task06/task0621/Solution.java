package com.java.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null, catGrandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catGrandmother, null);

        String brotherName = reader.readLine();
        Cat catBrother = new Cat(brotherName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catBrother);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parentmother;
        private Cat parentfather;


        Cat(String name) {
            this.name = name;
        }
        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }

        Cat(String name, Cat parentmother, Cat parentfather) {
            this.name = name;
            this.parentmother = parentmother;
            this.parentfather = parentfather;
        }

        @Override
        public String toString() {

            if (parentmother == null && parentfather == null)
                return "Cat name is " + name + ", no mother " + ", no father";
            if (parentmother == null)
                return "Cat name is " + name + ", no mother " + ", father is " + parentfather.name;
            if (parentfather == null)
                return "Cat name is " + name + ", mother is " + parentmother.name + ", no father";

           else
            return "Cat name is " + name + ", mother is "+ parentmother.name + ", father is " + parentfather.name;
        }

    }
}