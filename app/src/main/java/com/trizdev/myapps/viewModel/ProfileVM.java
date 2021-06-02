package com.trizdev.myapps.viewModel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.trizdev.myapps.Database.profileDAO;
import com.trizdev.myapps.Entity.ProfileRoomEntity;
import com.trizdev.myapps.Repository.ProfileRepo;

import java.util.List;

public class ProfileVM extends AndroidViewModel {
    private ProfileRepo repo;
    public profileDAO dao ;
    private ProfileRoomEntity profile;

    public ProfileVM(@NonNull Application application) {
        super(application);
        repo = new ProfileRepo(application);
        profile = repo.getProfile();
    }
    public  void  insert (ProfileRoomEntity dat){
        repo.insert(dat);
        Log.d("test", "insert: " +dat);
    }
    public  ProfileRoomEntity getProfile(){
        return profile;
    }
}
