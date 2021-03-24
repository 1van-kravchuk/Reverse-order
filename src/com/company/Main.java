package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] myArray = {2, 3, 1, 7, 11};
        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(myArray));
    }
}
