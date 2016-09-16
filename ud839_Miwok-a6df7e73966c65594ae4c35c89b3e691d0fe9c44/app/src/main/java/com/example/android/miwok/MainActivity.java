/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        final TextView number=(TextView) findViewById(R.id.numbers);
        number.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(v.getContext(),"Opening the listof numbers",Toast.LENGTH_SHORT).show();
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });



        TextView colors=(TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Toast.makeText(v.getContext(),"Opening the colors view",Toast.LENGTH_SHORT).show();
                Intent colorIntent=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorIntent);
            }
        });


        TextView family=(TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(v.getContext(),"Opening the family View",Toast.LENGTH_SHORT).show();
                Intent familyIntent=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });


        TextView phrases=(TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(v.getContext(),"Opening the phreses view",Toast.LENGTH_SHORT).show();
                Intent phrasesIntent=new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });


        TextView youtube = (TextView)findViewById(R.id.Youtube);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Opening song for you",Toast.LENGTH_SHORT).show();
                Uri uri= Uri.parse("https://www.youtube.com");
                Intent youtubeIntent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(youtubeIntent);
            }
        });

        TextView songs=(TextView)findViewById(R.id.Songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Playing song for you",Toast.LENGTH_SHORT).show();
                Intent songsIntent=new Intent(MainActivity.this,SongsActivity.class);
                startActivity(songsIntent);
            }
        });

    }

}
