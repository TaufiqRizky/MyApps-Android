package com.trizdev.myapps.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "Profile")
public class ProfileRoomEntity implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "ttl")
    private String ttl;

    @ColumnInfo(name = "nama")
    private String nama;

    @ColumnInfo(name = "bio")
    private String bio;

    @ColumnInfo(name = "alamat")
    private String alamat;

    @ColumnInfo(name = "jk")
    private String jk;

    @ColumnInfo(name = "goldar")
    private String goldar;

    @ColumnInfo(name = "nim")
    private String nim;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "tlp")
    private String tlp;

    public ProfileRoomEntity(int id, String ttl, String nama, String bio, String alamat, String jk, String goldar, String nim, String email, String tlp) {
        this.id = id;
        this.ttl = ttl;
        this.nama = nama;
        this.bio = bio;
        this.alamat = alamat;
        this.jk = jk;
        this.goldar = goldar;
        this.nim = nim;
        this.email = email;
        this.tlp = tlp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTlp() {
        return tlp;
    }

    public void setTlp(String tlp) {
        this.tlp = tlp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getGoldar() {
        return goldar;
    }

    public void setGoldar(String goldar) {
        this.goldar = goldar;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
