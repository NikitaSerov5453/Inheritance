package org.example.core;

import java.util.ArrayList;
import java.util.Comparator;

public class MyArray<T> {
    private ArrayList<T> tArrayList;

    public MyArray(ArrayList<T> tArrayList) {
        this.tArrayList = tArrayList;
    }

    public T findMax(Comparator<T> comparator) {
        T max = tArrayList.get(0);
        for (T t : tArrayList) {
            if (comparator.compare(max, t) < 0) {
                max = t;
            }
        }
        return max;
    }
}
