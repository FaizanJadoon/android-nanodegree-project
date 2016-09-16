package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

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
        final ArrayList<Word> words=new ArrayList<Word>();
        //words.add("one");
        words.add(new Word("One","Lutti",R.drawable.number_one));
        words.add(new Word("Two","otiiko",R.drawable.number_two));
        words.add(new Word("Three","Lutti",R.drawable.number_three));
        words.add(new Word("Four","otiiko",R.drawable.number_four));
        words.add(new Word("Five","Lutti",R.drawable.number_five));
        words.add(new Word("Six","otiiko",R.drawable.number_six));
        words.add(new Word("Seven","Lutti",R.drawable.number_seven));
        words.add(new Word("Eight","otiiko",R.drawable.number_eight));
        words.add(new Word("Nine","Lutti",R.drawable.number_nine));
        words.add(new Word("Ten","otiiko",R.drawable.number_ten));

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
        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);
        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this ,R.layout.list_item,words);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

        //when click on the listItems single item this is called back
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //getting the word by passing the position of that word
                Word word = words.get(position);
                Toast.makeText(NumbersActivity.this,word.getDefaultTranslation(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
