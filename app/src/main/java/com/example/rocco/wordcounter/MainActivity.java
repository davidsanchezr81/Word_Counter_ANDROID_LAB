package com.example.rocco.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private Button countButton;
    private TextView wordCountView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity","oncreate");
        userInput = findViewById(R.id.words_input);
        countButton = findViewById(R.id.count_button);
        wordCountView = findViewById(R.id.answer_textview);
    }

    public void onCountWordButtonClicked(View clickedView) {
        Log.e("MainActivity", "count word button clicked");

        String wordcount = "";

        String sentenceThatWasEntered = userInput.getText().toString();
        Log.e("MainActivity", sentenceThatWasEntered);

        String[] splitString = sentenceThatWasEntered.split(" ");

        HashMap<String, Integer> words = new HashMap<>();
        for (String word : splitString) {
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            } else {
                words.put(word, 1);
            }


        }

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            wordcount += entry.getKey() + " in sentence = " + entry.getValue() + ", ";

        }
        wordCountView.setText(wordcount);
    }

}
