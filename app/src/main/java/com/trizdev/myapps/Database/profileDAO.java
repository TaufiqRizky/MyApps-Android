package com.trizdev.myapps.Database;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.trizdev.myapps.Entity.ProfileRoomEntity;

import java.util.List;

public interface profileDAO {

    @Insert
    void insert(ProfileRoomEntity profile);

    @Update
    void update(ProfileRoomEntity profile);

    @Delete
    void  delete(ProfileRoomEntity profile);

    @Query("SELECT * FROM profile ")
    LiveData<List<ProfileRoomEntity>> getProfile();


}
