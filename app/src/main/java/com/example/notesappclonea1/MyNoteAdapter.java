package com.example.notesappclonea1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyNoteAdapter extends ArrayAdapter<Note> {
    public MyNoteAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Note> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if(v == null)
        {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.single_note_design, parent, false);
        }

        Note n = getItem(position);

        TextView tvTitle = v.findViewById(R.id.tvTitle);
        TextView tvDescription = v.findViewById(R.id.tvDesc);
        TextView tvDate = v.findViewById(R.id.tvDate);
        ImageView ivFav = v.findViewById(R.id.ivFav);

        tvTitle.setText(n.getTitle());
        tvDescription.setText(n.getDescription().substring(0,15)+"...");
        tvDate.setText(n.getDateAndTime().toString());

        if(n.isFav())
        {
            ivFav.setImageResource(R.drawable.icon_favourite);
        }
        else
        {
            ivFav.setImageResource(R.drawable.icon_not_fav);
        }

        ivFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.setFav(!n.isFav());
                if(n.isFav())
                {
                    ivFav.setImageResource(R.drawable.icon_favourite);
                }
                else
                {
                    ivFav.setImageResource(R.drawable.icon_not_fav);
                }
            }
        });



        return v;
    }


}
