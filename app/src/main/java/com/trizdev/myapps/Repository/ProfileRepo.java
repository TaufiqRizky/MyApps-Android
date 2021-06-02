package com.trizdev.myapps.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.trizdev.myapps.Database.ProfileDatabase;
import com.trizdev.myapps.Database.profileDAO;
import com.trizdev.myapps.Entity.ProfileRoomEntity;

import java.util.List;

public class ProfileRepo {
    private profileDAO dao;
    private ProfileRoomEntity profile;

    public ProfileRepo(Application application) {
        ProfileDatabase db = ProfileDatabase.getInstance(application);
        dao=db.profileDAO();
        profile= dao.getProfile();
    }

    public void insert (ProfileRoomEntity pro){
        new InsertProfileAsnycTask(dao).execute(pro);
    }

    public ProfileRoomEntity getProfile() {
        return profile;
    }

    private  static class  InsertProfileAsnycTask extends AsyncTask<ProfileRoomEntity,Void,Void> {
        private  profileDAO dao;

        private InsertProfileAsnycTask(profileDAO dao){
            this.dao=dao;
        }

        @Override
        protected Void doInBackground(ProfileRoomEntity... profiles) {
            dao.insert(profiles[0]);
            //dao.insert(new ProfileRoomEntity(1, "Bandung, 19 Agustus 2000", "Taufiq Rizky", "Hi my name is Taufiq, im a freelancer fullstack web Developer" ,"Jl. Taman Saturnus 1 no.45, Bandung","Laki-Laki","O","10118080","taufiq.it2@gmail.com","+62 8981980002"));
            return null;
        }
    }
}
