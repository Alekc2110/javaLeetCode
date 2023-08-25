package com.java.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> na3 = new ArrayList<>();
        ArrayList<Integer> na2 = new ArrayList<>();
        ArrayList<Integer> ost = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i<20; i++){
            int p = Integer.parseInt(r.readLine());
            list.add(p);
            }
            for(int i =0; i<list.size(); i++) {
                if (list.get(i) % 3 == 0) na3.add(list.get(i));
                if (list.get(i) % 2 == 0) na2.add(list.get(i));
                if ((list.get(i) % 3 != 0) && (list.get(i) % 2 != 0))
                    ost.add(list.get(i));
            }

            printList(na3);
        printList(na2);
        printList(ost);

    }


    public static void printList(List<Integer> list) {
        for(int i: list)
            System.out.println(i);
    }
}
