package com.trizdev.myapps.DummyData;

import com.trizdev.myapps.Entity.friend;
import com.trizdev.myapps.R;

import java.util.ArrayList;

public class Friend {
    private static String [] nama ={
            "Gina",
            "Ilham",
            "Helma",
            "Ergan",
            "Alif",
            "Huma",
            "Rifky",
            "Annur"
    };


    private static int [] foto ={
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f3,
            R.drawable.f4,
            R.drawable.f5,
            R.drawable.f6,
            R.drawable.f7,
            R.drawable.f8
    };

    public static ArrayList<friend> getListData(){
        ArrayList<friend> list = new ArrayList<>();
        for (int position = 0; position < nama.length; position++){
            friend day = new friend();
            day.setNama(nama[position]);
            day.setFoto(foto[position]);
            list.add(day);
        }
        return list;
    }
}
