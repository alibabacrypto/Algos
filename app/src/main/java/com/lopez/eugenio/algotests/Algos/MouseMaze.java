package com.lopez.eugenio.algotests.Algos;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Eugenio on 7/10/18.
 * A mouse enters this maze at A and keeps moving. When he gets to an intersection he takes either of the two
 * paths in front of him with the same probability but he doesn't turn back. He can get out of the maze only at A or
 * B. What are the chances that he exits the maze B?
 * Hint 1: Use a Random number to decide which path the mouse takes. E.g. if you generate random numbers
 * between 0 and 1, you can choose the numbers less than 0.5 to go one way and more than 0.5 to take the other
 * path.
 * Hint 2: Calculating the probability that the mouse comes out at B is the same as running a very large number
 * of experiments and calculating the ratio to how many times it comes out at B compared to the total number of
 */

public class MouseMaze {

    private ArrayList<Integer> optionL = new ArrayList<>();
    private ArrayList<Integer> optionR = new ArrayList<>();
    private ArrayList<Integer> optionD = new ArrayList<>();
    private ArrayList<Integer> optionU = new ArrayList<>();
    int start;
    boolean exitA = false;
    boolean exitB = false;
    int exitCounterA = 0;
    int exitCounterB = 0;
    ArrayList<Integer> position = new ArrayList<>();

    public MouseMaze() {
        optionL = new ArrayList<>();
        optionL.add(0);
        optionL.add(1);
        optionL.add(2);
        optionU = new ArrayList<>();
        optionU.add(1);
        optionU.add(3);
        optionU.add(4);
        optionR = new ArrayList<>();
        optionR.add(4);
        optionR.add(5);
        optionR.add(6);
        optionD = new ArrayList<>();
        optionD.add(2);
        optionD.add(3);
        optionD.add(5);
    }


    public void run() {
        int trials = 100;

        start = 0;
        position = optionL;

        for (int i = 0; i <= trials; i++) {
            choosePath();
        }

        double ratio = trials / exitCounterB;
        System.out.println("Ration = "+ trials + " / " + exitCounterB +" = " + trials/exitCounterB);

        Log.d("ratio = ", String.valueOf(ratio));

    }


    private void choosePath() {

        int choice = randomGen();

        if (choice == 0) {

            if (position.get(0) != start) {
                start = position.get(0);
            } else {
                start = position.get(1);
                position = optionU;
            }

        } else {

            if (position.get(2) != start) {
                start = position.get(2);
            } else {
                start = position.get(1);
            }
        }

        getPosition();

    }


    private void getPosition() {
        switch (start) {

            case 0:
                exitCounterA++;
                position = optionL;
                start = 0;
                Log.d("EXIT AT A = ", String.valueOf(exitCounterA));
                break;
            case 1:
                if (position == optionL) {
                    position = optionU;
                } else {
                    position = optionL;
                }
                break;
            case 2:
                if (position == optionL) {
                    position = optionD;
                } else {
                    position = optionL;
                }
                break;
            case 3:
                if (position == optionD) {
                    position = optionU;
                } else {
                    position = optionD;
                }
                break;
            case 4:
                position = optionR;
                if (position == optionU) {
                    position = optionR;
                } else {
                    position = optionU;
                }
                break;
            case 5:
                if (position == optionD) {
                    position = optionR;
                } else {
                    position = optionD;
                }
                break;

            case 6:
                exitCounterB++;
                position = optionL;
                start = 0;
                Log.d("EXIT AT B = ", String.valueOf(exitCounterB));
                break;
        }

    }


    private int randomGen() {

        Random rand = new Random();
        int n = rand.nextInt(2);

        return n;
    }


}
