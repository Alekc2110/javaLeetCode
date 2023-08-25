package com.java.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grangf = new Human("Mitia", true, 65  );
        Human grandm = new Human("Masha", false, 64  );
        Human grandm1 = new Human("Mania", false, 64  );
        Human grandf1 = new Human("Misha", true, 67 );
        Human father = new Human("Vlad", true, 50, grangf, grandm );
        Human mother = new Human("Tania", false, 45 , grandf1, grandm1);
        Human son  = new Human("Dima", true, 20, father, mother );
        Human dauther  = new Human("Rita", false, 20, father, mother );
        Human dauther1  = new Human("Yana", false, 21, father, mother );
        System.out.println(grangf.toString());
        System.out.println(grandm.toString());
        System.out.println(grandm1.toString());
        System.out.println(grandf1.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son.toString());
        System.out.println(dauther.toString());
        System.out.println(dauther1.toString());



    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father, mother;
        public Human(String name, boolean sex, int age){
           this.name = name;
           this.age = age;
           this.sex = sex;


        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother  = mother;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















