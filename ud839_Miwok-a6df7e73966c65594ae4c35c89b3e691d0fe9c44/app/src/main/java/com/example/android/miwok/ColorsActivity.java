package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //String[] numbers = new String[10];
//        numbers[0]="one";
//        numbers[1]="two";
//        numbers[2]="three";
//        numbers[3]="four";
//        numbers[4]="five";
//        numbers[5]="six";
//        numbers[6]="seven";
//        numbers[7]="eight";
//        numbers[8]="nine";
//        numbers[9]="ten";
        ArrayList<Word> words=new ArrayList<Word>();
        //words.add("one");
        words.add(new Word("Red","Lutti",R.drawable.color_red));
        words.add(new Word("Green","otiiko",R.drawable.color_green));
        words.add(new Word("Black","Lutti",R.drawable.color_black));
        words.add(new Word("brown","Lutti",R.drawable.color_brown));
        words.add(new Word("pink","otiiko",R.drawable.color_dusty_yellow));
        words.add(new Word("gray","Lutti",R.drawable.color_gray));
        words.add(new Word("yello","otiiko",R.drawable.color_mustard_yellow));
        words.add(new Word("dustyYello","Lutti",R.drawable.color_dusty_yellow));
        words.add(new Word("White","otiiko",R.drawable.color_white));

        //LinearLayout numLayout = (LinearLayout)findViewById(R.id.numbersLayout);
//        TextView wordView=new TextView(this);
//        wordView.setText(words.get(0));
//        numLayout.addView(wordView);
//        for (int i=0;i<words.size();i++)
//        {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            numLayout.addView(wordView);
//        }
        WordAdapter adapter = new WordAdapter(this,words,R.color.category_colors);
        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this ,R.layout.list_item,words);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
