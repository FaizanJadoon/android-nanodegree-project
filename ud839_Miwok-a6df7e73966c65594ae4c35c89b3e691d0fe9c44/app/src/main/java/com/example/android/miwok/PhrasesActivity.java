package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words=new ArrayList<Word>();

        words.add(new Word("Ph1: Some random text?","Lutti"));
        words.add(new Word("Ph2: Some random text?","otiiko"));
        words.add(new Word("Ph3: Some random text?","Lutti"));
        words.add(new Word("Ph4: Some random text?","otiiko"));
        words.add(new Word("Ph5: Some random text?","Lutti"));
        words.add(new Word("Ph6: Some random text?","otiiko"));
        words.add(new Word("Ph7: Some random text?","Lutti"));
        words.add(new Word("Ph8: Some random text?","otiiko"));
        words.add(new Word("Ph9: Some random text?","Lutti"));
        words.add(new Word("Ph10: Some random text?","otiiko"));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);
        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this ,R.layout.list_item,words);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
