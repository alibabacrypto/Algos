package com.lopez.eugenio.algotests.Algos;

import android.util.Log;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Eugenio on 7/16/18.
 */

public class MorseCode {

    private String[] words = {"gin", "zen", "gig", "msg"};
    StringBuilder morse;
    String word;
    HashMap<String, String> hm = new HashMap<>();
    HashSet<String> morseHs = new HashSet<>();

    //hashmap with the letters being the keys
    //loop through each word and match letters to morse.
    // will need a string to represent the word, a string for to create the morse
    //hashSet to get rid of repeats

    public int uniqueMorseRepresentations() {

        HashMap<String,String> hmm = new HashMap<>();

        hmm.put("a",".-");
        hmm.put("b","-...");
        hmm.put("c","-.-.");
        hmm.put("d","-..");
        hmm.put("e",".");
        hmm.put("f","..-.");
        hmm.put("g","--.");
        hmm.put("h","....");
        hmm.put("i","..");
        hmm.put("j",".---");
        hmm.put("k","-.-");
        hmm.put("l",".-..");
        hmm.put("m","--");
        hmm.put("n","-.");
        hmm.put("o","---");
        hmm.put("p",".--.");
        hmm.put("q","--.-");
        hmm.put("r",".-.");
        hmm.put("s","...");
        hmm.put("t","-");
        hmm.put("u","..-");
        hmm.put("v","...-");
        hmm.put("w",".--");
        hmm.put("x","-..-");
        hmm.put("y","-.--");
        hmm.put("z","--..");

        for (String s : words) {

            morse = new StringBuilder("");

            for (int i = 0; i < s.length(); i++) {

                morse = morse.append(hmm.get(String.valueOf(s.charAt(i))));

            }

            morseHs.add(morse.toString());
        }

        Log.d("VARIATIONS = ", String.valueOf(morseHs.size()));
        return morseHs.size();
    }
}
