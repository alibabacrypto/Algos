package com.lopez.eugenio.algotests.Algos;

import android.util.Log;

import java.util.HashSet;

/**
 * Created by Eugenio on 7/11/18.
 */

public class Matrix {

//    private int[] input = {7, 8, 1, 4, 7, 2, 1, 3, 4, 6, 5};
//    double test = 20;
//    double temp;
//
//    public void findMultiple() {
//
//        HashSet<Double> hashSet = new HashSet<>();
//
//        for (int i = 0; i < input.length; i++) {
//
//            hashSet.add((double)input[i]);
//
//            temp = test / input[i];
//
//            Log.d("INPUT temp= ", String.valueOf(temp));
//
//            if (hashSet.contains(temp)) {
//
//                Log.d("Multiples  = ", String.valueOf(input[i]) + " & " + temp);
//
//                break;
//            }
//
//        }
//
//    }


    String J = "aAD";
    String S = "aAAcDbb";

    //11ms runtime
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> hs = new HashSet<>();
        int counter = 0;

        if (J != null && S != null) {

            for (int i = 0; i < J.length(); i++) {
                hs.add(J.charAt(i));
            }

            for (int i = 0; i < S.length(); i++) {

                if (hs.contains(S.charAt(i))) {
                    counter++;
                }

            }

        }
        return counter;
    }

    // 9ms runtime MOST OPTIMUM
    //checking if S chars have an index within J
    public int numJewelsInStones() {
        int counter = 0;
        char[] chars = S.toCharArray();

        System.out.println("J.indexOf() == " + J.indexOf('A'));
        System.out.println("J.indexOf() == " + J.indexOf('E'));

        for (char s : chars) {

            Log.d("J.indezOf(s) ==", String.valueOf(J.indexOf(s)));

            if (J.indexOf(s) != -1) {
                counter++;
            }
        }
        Log.d("Number of Jewels = ", String.valueOf(counter));
        return counter;
    }


}




