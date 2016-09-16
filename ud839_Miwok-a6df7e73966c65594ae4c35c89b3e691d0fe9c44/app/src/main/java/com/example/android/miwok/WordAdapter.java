package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Faizan on 10/09/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    public WordAdapter(Context context, List<Word> words,int ColorResourceId) {
        super(context, 0, words);
        mColorResourceId=ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word currentWord = getItem(position);
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView miWorkImage = (ImageView) ListItemView.findViewById(R.id.image);
        if (currentWord.getmImageResourceId() != -1) {
            miWorkImage.setImageResource(currentWord.getmImageResourceId());
        }
        else {
            miWorkImage.setVisibility(View.GONE);
        }
        TextView miworkTextView = (TextView) ListItemView.findViewById(R.id.miwork_text_view);
        miworkTextView.setText(currentWord.getmMiworkTranslation());

        TextView defaultTextView = (TextView) ListItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        View textContainer = ListItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return ListItemView;
    }
}
