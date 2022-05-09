package com.example.navdrawer_086;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class GridViewArrayAdapter extends ArrayAdapter <Artikel> {
    public GridViewArrayAdapter (@NonNull Context context, int resource, @NonNull List objects){
        super (context, resource, objects);
    }

    @NonNull
    @Override
    public View getView (int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.grid_item, parent,false);
        Artikel artikel = getItem(position);
        ImageView img =(ImageView) v.findViewById(R.id.imageViewgrid);
        TextView title =(TextView) v.findViewById(R.id.textTitlegrid);
        TextView timestamp =(TextView) v.findViewById(R.id.textTimegrid);
        TextView descriptions =(TextView) v.findViewById(R.id.textDescgrid);

        img.setImageResource(artikel.getImageId());

        title.setText(artikel.getTitle());
        timestamp.setText(artikel.getTimestamp());
        descriptions.setText(artikel.getDescriptions());

        return v;
    }
}
