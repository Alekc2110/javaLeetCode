package com.java.task.multiIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> integers1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> integers2 = new ArrayList<>(List.of(6,7,8,9,10));

        MultiIterator<Integer> iterator = new MultiIterator<>(integers1.iterator(), integers2.iterator());

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println("list1: "+integers1);
        System.out.println("list2: "+integers2);


    }
}

class MultiIterator<T>  implements Iterator<T> {

    private final Iterator<T> a;
    private final Iterator<T> b;
    int lastRet;

    public MultiIterator(Iterator<T> a, Iterator<T> b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean hasNext() {
        return a.hasNext() || b.hasNext();
    }

    @Override
    public T next() {
        if(a.hasNext()){
            lastRet = 1;
            return a.next();
        }
        lastRet = 2;
        return b.next();
    }

    public void remove(){
        if(lastRet == -1) throw new NoSuchElementException("no element");
        if(lastRet == 1){
            a.remove();
        } else {
            b.remove();
        }
        lastRet = -1;
    }
}