/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.util;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Akhilesh
 */
public class MyList<T> implements DynamicList<T> {

    private Object[] myList = new MyList[0];

    @Override
    public boolean add(T t) {
        if (myList.length == 0) {
            myList = new Object[1];
            myList[0] = t;
            return  true;
        } else  {
            Object[] tempArray = new Object[myList.length + 1];

            for (int i = 0; i < myList.length; i++) {
                tempArray[i] = myList[i];
            }
            tempArray[myList.length] = t;
            myList = tempArray;
            return true;
        }
    }

    @Override
    public T get(int index) {
        return (T) myList[index];

    }

    @Override
    public int size() {
         return myList.length;
    }

    @Override
    public void sort(boolean flag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>) Arrays.asList(myList).iterator();
    }

    @Override
    public void delete(int index) {
        if(get(index) != null){
        }
    }

}
