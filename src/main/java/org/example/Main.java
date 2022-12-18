package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

       Main main = new Main();
       Integer [] someArray = new Integer[]{null, 0, null, 3, -8};
       System.out.println(main.checkArray(someArray));
    }

    public Boolean checkArray (Integer[] array) {
        boolean temp = false;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                temp = true;
                list.add(String.valueOf(i));
            }
        }
        if (temp){
            throw new CheckArrayException(new StringBuilder("Массив содержит пустые ячейки под номерами :" + String.join(", ", list)).toString());
        }
        return  temp;
    }
}