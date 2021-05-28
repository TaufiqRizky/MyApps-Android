package com.trizdev.myapps.DummyData;

import com.trizdev.myapps.Entity.music;
import com.trizdev.myapps.R;

import java.util.ArrayList;

public class Music {
    private static String [] judul ={
            "Blue Jeans",
            "It Will Rain",
            "Plaza Avenue",
            "At My Worst",
            "Happy",
            "Bertaut",
            "The Lazy Song"

    };
    private static String [] detail ={
            "by Gangga Kusuma",
            "by Bruno Mars",
            "by Ardhito Pramono",
            "by Pink Sweat$",
            "by Ardhito Pramono",
            "by Nadin Amizah",
            "by Bruno Mars"
    };

    private static int [] icon ={
            R.drawable.m1,
            R.drawable.m2,
            R.drawable.m3,
            R.drawable.m4,
            R.drawable.m5,
            R.drawable.m6,
            R.drawable.m7
    };

    public static ArrayList<music> getListData(){
        ArrayList<music> list = new ArrayList<>();
        for (int position = 0; position < judul.length; position++){
            music day = new music();
            day.setJudul(judul[position]);
            day.setDetail(detail[position]);
            day.setIcon(icon[position]);
            list.add(day);
        }
        return list;
    }
}
