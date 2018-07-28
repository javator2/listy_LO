package com.sda.listy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomList<Integer> list = new CustomList<Integer>();

        list.add(2);
        list.add(2);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);



        for (Integer list1: list){
            System.out.println(list1);
        }

    }
}
