package com.kodilla;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Random;

public class WordsManager {
    ArrayList<String> evenAs;
    ArrayList<String> oddAs;

    public WordsManager() {
        evenAs = new ArrayList<String>();
        oddAs = new ArrayList<String>();
    }

    public void manageWords(ArrayDeque<String> queue) {
        while(queue.size() > 0) {
            String word = queue.poll();
            if((word.length() % 2) == 0)
                evenAs.add(word);
            else
                oddAs.add(word);
        }
        System.out.println("Even number of As (" + evenAs.size() + ") : " + evenAs);
        System.out.println();
        System.out.println("Odd number of As (" + oddAs.size() + ") : " + oddAs);
        System.out.println();
    }
}


class LetterA {

    public static void main (String[] args) throws java.lang.Exception {
        ArrayDeque<String> firstQueue = new ArrayDeque<String>();
        Random generator = new Random();
        for(int k = 0; k < 50; k++) {
            String a = "";
            int noOfLetters = generator.nextInt(50)+1;
            for(int n = 0; n <= noOfLetters; n++) {
                a += "a";
            }

            firstQueue.offer(a);
        }
        System.out.println(firstQueue);
        System.out.println();

        WordsManager wordsDistributor = new WordsManager();
        wordsDistributor.manageWords(firstQueue);
    }
}
