package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words=new ArrayList<Word>();

        words.add(new Word("Father","Lutti",R.drawable.family_father));
        words.add(new Word("Mother","otiiko",R.drawable.family_mother));
        words.add(new Word("Younger Sister","Lutti",R.drawable.family_younger_sister));
        words.add(new Word("Daughter","otiiko",R.drawable.family_daughter));
        words.add(new Word("Younger Brother","Lutti",R.drawable.family_younger_brother));
        words.add(new Word("Grand Father","otiiko",R.drawable.family_grandfather));
        words.add(new Word("Grand Mother","Lutti",R.drawable.family_grandmother));
        words.add(new Word("Older Sister","otiiko",R.drawable.family_older_sister));
        words.add(new Word("Older Brother","Lutti",R.drawable.family_older_brother));
        words.add(new Word("Son","otiiko",R.drawable.family_son));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_family);
        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this ,R.layout.list_item,words);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
