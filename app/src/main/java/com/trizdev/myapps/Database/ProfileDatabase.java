package com.trizdev.myapps.Database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.trizdev.myapps.Entity.ProfileRoomEntity;

public abstract class ProfileDatabase extends RoomDatabase {
    private static ProfileDatabase instance;
    public abstract profileDAO profileDAO();

    private static  RoomDatabase.Callback roomCallback= new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };

    public static synchronized ProfileDatabase getInstance(Context context) {

        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    ProfileDatabase.class, "Profile.db")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return instance;
    }

    private  static  class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private profileDAO dao;

        private  PopulateDbAsyncTask(ProfileDatabase db){
            dao = db.profileDAO();
        }

        @Override
        protected Void doInBackground(Void... voids) {
              dao.insert(new ProfileRoomEntity(1, "Bandung, 19 Agustus 2000", "Taufiq Rizky", "Hi my name is Taufiq, im a freelancer fullstack web Developer" ,"Jl. Taman Saturnus 1 no.45, Bandung","Laki-Laki","O","10118080","taufiq.it2@gmail.com","+62 8981980002"));


            return null;
        }
    }

}
