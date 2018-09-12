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
    public int[] merge(int[] firstArray, int[] secondArray) {
      int[] result = new int[firstArray.length + secondArray.length];

      int indexOfSecondArray = 0;
      int resultIndex = 0;
      for(int i = 0; i < firstArray.length; i++) {
          for(int j = indexOfSecondArray; j < secondArray.length; j++) {
            if(firstArray[i] < secondArray[j]) {
              result[resultIndex++] = firstArray[i];
              indexOfSecondArray = j;
              break;
            } else {
              result[resultIndex++] = secondArray[j];
            }
          }
      }

      for(int j = indexOfSecondArray; j < secondArray.length; j++) {
          result[resultIndex++] = secondArray[j];
      }

      return result;
    }

    /**
    */
    public int[] merge(int[] firstArray, int indexInFirstArray, int[] secondArray, int indexInSecondArray) {

    }



}
