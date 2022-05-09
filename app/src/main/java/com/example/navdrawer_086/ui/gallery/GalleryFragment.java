package com.example.navdrawer_086.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.navdrawer_086.Artikel;
import com.example.navdrawer_086.GridViewArrayAdapter;
import com.example.navdrawer_086.R;
import com.example.navdrawer_086.databinding.FragmentGalleryBinding;


import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {

    private GridView gridView;
    private GridViewArrayAdapter gridViewArrayAdapter;
    private List<Artikel> artikelList;
    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        gridView=(GridView) root.findViewById(R.id.text_gallery);
        getArtikelList();
        gridViewArrayAdapter=new
                GridViewArrayAdapter(root.getContext(), R.layout.list_item,artikelList);
        gridView.setAdapter(gridViewArrayAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i,
                                    long l) {
                Toast.makeText(root.getContext().getApplicationContext(), artikelList.get(i).getImageId(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private List<Artikel> getArtikelList()
    {
        artikelList = new ArrayList<>();
        artikelList.add(new
                Artikel(R.drawable.ic_baseline_phone_iphone_24,"Title 1",
                "1 hours ago","Descriptions of text 1"));
        artikelList.add(new
                Artikel(R.drawable.ic_baseline_phone_iphone_24,"Title 2",
                "1 hours ago","Descriptions of text 2"));
        artikelList.add(new
                Artikel(R.drawable.ic_baseline_phone_iphone_24,"Title 3",
                "1 hours ago","Descriptions of text 3"));
        artikelList.add(new
                Artikel(R.drawable.ic_baseline_phone_iphone_24,"Title 4",
                "1 hours ago","Descriptions of text 4"));
        artikelList.add(new
                Artikel(R.drawable.ic_baseline_phone_iphone_24,"Title 5",
                "1 hours ago","Descriptions of text 5"));
        artikelList.add(new
                Artikel(R.drawable.ic_baseline_phone_iphone_24,"Title 6",
                "1 hours ago","Descriptions of text 6"));
        artikelList.add(new
                Artikel(R.drawable.ic_baseline_phone_iphone_24,"Title 7",
                "1 hours ago","Descriptions of text 7"));
        artikelList.add(new
                Artikel(R.drawable.ic_baseline_phone_iphone_24,"Title 8",
                "1 hours ago","Descriptions of text 8"));
        artikelList.add(new
                Artikel(R.drawable.ic_baseline_phone_iphone_24,"Title 9",
                "1 hours ago","Descriptions of text 9"));
        artikelList.add(new
                Artikel(R.drawable.ic_baseline_phone_iphone_24,"Title 10",
                "1 hours ago","Descriptions of text 10"));
        return artikelList;
    }

}