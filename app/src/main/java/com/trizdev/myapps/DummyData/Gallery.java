package com.trizdev.myapps.DummyData;

import com.trizdev.myapps.Entity.gallery;
import com.trizdev.myapps.R;

import java.util.ArrayList;

public class Gallery {
    private static int [] foto ={
            R.drawable.g1,
            R.drawable.g2,
            R.drawable.g3,
            R.drawable.g4,
            R.drawable.g5,
            R.drawable.g6,
            R.drawable.g7,
            R.drawable.g8
    };

    public static ArrayList<gallery> getListData(){
        ArrayList<gallery> list = new ArrayList<>();
        for (int position = 0; position < foto.length; position++){
            gallery day = new gallery();
            day.setFoto(foto[position]);
            list.add(day);
        }
        return list;
    }
}
