package com.trizdev.myapps.DummyData;

import com.trizdev.myapps.R;

import java.util.ArrayList;
import com.trizdev.myapps.Entity.daily;

public class Daily {
    private static String [] judul ={
            "Bangun Tidur",
            "Sarapan",
            "Makan Siang",
            "Main Game",
            "Tugas Kuliah",
            "Tidur"
    };
    private static String [] detail ={
            "05.00",
            "07.00",
            "12.00",
            "Free Time",
            "21.00 - 00.00",
            "00.00 - 05.00"
    };

    private static int [] icon ={
            R.drawable.daily_wake,
            R.drawable.daily_eat,
            R.drawable.daily_eat2,
            R.drawable.daily_play,
            R.drawable.daily_work,
            R.drawable.daily_sleep
    };

    public static ArrayList<daily> getListData(){
        ArrayList<daily> list = new ArrayList<>();
        for (int position = 0; position < judul.length; position++){
            daily day = new daily();
            day.setJudul(judul[position]);
            day.setDetail(detail[position]);
            day.setIcon(icon[position]);
            list.add(day);
        }
        return list;
    }
}
