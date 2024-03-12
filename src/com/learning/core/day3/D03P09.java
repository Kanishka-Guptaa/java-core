package com.learning.core.day03;

import java.util.*;

public class D03P09 
{
    public static boolean canFormCircle(String[] arr) 
    {
        if (arr == null || arr.length == 0) 
        {
            return true;
        }
        Set<Integer> visitedIndices = new HashSet<>();
        return canFormCircleRecursive(arr, visitedIndices, 0, arr[0].charAt(0));
    }

    private static boolean canFormCircleRecursive(String[] arr, Set<Integer> visitedIndices, int currentIndex, char startChar) 
    {
        if (visitedIndices.size() == arr.length - 1 && arr[currentIndex].charAt(arr[currentIndex].length() - 1) == startChar) 
        {
            return true;
        }

        for (int i = 0; i < arr.length; i++) 
        {
            if (!visitedIndices.contains(i) && arr[currentIndex].charAt(arr[currentIndex].length() - 1) == arr[i].charAt(0)) 
            {
                visitedIndices.add(i);
                if (canFormCircleRecursive(arr, visitedIndices, i, startChar)) 
                {
                    return true;
                }
                visitedIndices.remove(i);
            }
        }
        return false;
    }

    public static void main(String[] args) 
    {
        String[] arr1 = {"abc", "efg", "cde","ghi","ija"};
        System.out.println(canFormCircle(arr1));  // Output should be true

        String[] arr2 = {"ljk", "kji", "abc", "cba"};
        System.out.println(canFormCircle(arr2));  // Output should be true

        String[] arr3 = {"ab", "bc", "cd", "ad"};
        System.out.println(canFormCircle(arr3));  // Output should be false
    }
}

