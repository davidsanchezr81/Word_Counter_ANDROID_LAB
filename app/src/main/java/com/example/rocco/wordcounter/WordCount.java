package com.example.rocco.wordcounter;

import java.util.ArrayList;

/**
 * Created by rocco on 19/03/2018.
 */

public class WordCount {


    ArrayList<String> inputText;

    public WordCount(){
            this.inputText = new ArrayList<>();
           }

    public int getWordCount(String input){
        String text[] = input.split(" ");
        return text.length;
         }
 }

