package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static java.sql.Types.NULL;

/**
 * Created by sarthak on 1/10/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColor;
    public WordAdapter(Context context, ArrayList<Word> word,int colorResourceId) {
        super(context,0, word);
    mColor=colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item ,parent , false);
        }
        Word currentWord = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        iconView.setImageResource(currentWord.getImgId());
        if (currentWord.getImgId()==NULL)
            iconView.setVisibility(View.GONE);

        int color = ContextCompat.getColor(getContext(),mColor);
        View textContainer = listItemView.findViewById(R.id.linear_layout);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
