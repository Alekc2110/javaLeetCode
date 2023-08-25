package com.java.task.task07.task0712;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Shurick on 11.10.2017.
 */
public class dfdf {
    public static void main(String[] args) throws  Exception {

    ArrayList<String> list = new ArrayList<String>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for(int i = 0; i < 10; i++)
            list.add(br.readLine());
    String max,min,s;
    max = list.get(0);
    min = list.get(0);
    int m = 0,n = 0;
    for(int i = 1; i < list.size(); i++){
        s = list.get(i);
        if(max.length() < s.length()){
            m = i;
            max = s;}
        else if(min.length() > s.length()){
            n = i;
            min = s;}
    }
    if(m < n)
            System.out.println(max);
    else if(n < m)
            System.out.println(min);
}
}
