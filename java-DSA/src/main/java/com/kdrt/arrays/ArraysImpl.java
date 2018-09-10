package com.kdrt.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArraysImpl {

    public ArraysImpl() {

    }

    public static void main(String[] args) {
      //Map<Integer, Integer> result = findPairs(new int[])
    }

    /**
    *Array of integers, find all the pairs that have their sum a certain number
    */
    public static Map<Integer, Integer> findPairs(int[] array, int n){

      Map<Integer, Integer> result = new HashMap<>();

      //this will be initialised will all false values
      int[] frequencyVector = new int[n];

      for(int val : array) {
        if(n - val >= 0) {
          frequencyVector[val]++;
          if((frequencyVector[n - val] == 1) && (frequencyVector[val] == 1)){
            //found a pair
            System.out.println(val + " " + (n - val));
          }
        }
      }

      return result;
    }

    /**
    *
    */
}
