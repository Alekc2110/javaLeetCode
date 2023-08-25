package com.java.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        while(a>0){
            if((a%10)%2==0)
                even++;
            if((a%10)%2!=0)
                odd++;
            a/=10;
        }
        System.out.println("Even: "+ even + " Odd: " + odd);
    }
}
