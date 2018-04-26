package com.flequesboard.java.apps;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //test methods
        List<Integer> ls = Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,9});
        SplitFind x = new SplitFind(ls);
        System.out.println(x.getMissingNum());
        FileStreamForEveryNthWord y = new FileStreamForEveryNthWord("resources/input.txt");

    }
}
