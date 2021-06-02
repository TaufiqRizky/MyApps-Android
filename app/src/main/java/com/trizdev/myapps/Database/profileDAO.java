package com.trizdev.myapps.Database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.trizdev.myapps.Entity.ProfileRoomEntity;

import java.util.List;
@Dao
public interface profileDAO {

    @Insert
    void insert(ProfileRoomEntity profile);

    @Query("SELECT * FROM profile where nim = '10118080' ")
    ProfileRoomEntity getProfile();


}
