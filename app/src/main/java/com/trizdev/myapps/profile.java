package com.trizdev.myapps;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.trizdev.myapps.Entity.ProfileRoomEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link profile#newInstance} factory method to
 * create an instance of this fragment.
 */
//tgl pengerjaan : 28/05/2021
//Nim : 10118080
//Nama : Taufiq Rizky
//Kelas : IF2/S1/VI
public class profile extends Fragment {
    public ProfileRoomEntity profile;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public profile() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment profile.
     */
    // TODO: Rename and change types and number of parameters
    public static profile newInstance(String param1, String param2) {
        profile fragment = new profile();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        Button btn_insta = (Button) view.findViewById(R.id.btn_insta);
        Button btn_map = (Button) view.findViewById(R.id.btn_maps);
        Button btn_info = (Button) view.findViewById(R.id.btn_info);
        TextView nama = view.findViewById(R.id.tv_nama);
        TextView nim = view.findViewById(R.id.tv_nim);
        TextView bio = view.findViewById(R.id.tv_bio);
        TextView gender = view.findViewById(R.id.tv_gender);
        TextView alamat = view.findViewById(R.id.tv_alamat);
        TextView goldar = view.findViewById(R.id.tv_goldar);
        TextView ttl = view.findViewById(R.id.tv_ttl);
        TextView hp = view.findViewById(R.id.tv_hp);
        TextView email = view.findViewById(R.id.tv_email);


        nama.setText(profile.getNama());
        nim.setText(profile.getNim());
        bio.setText(profile.getBio());
        gender.setText(profile.getJk());
        alamat.setText(profile.getAlamat());
        goldar.setText(profile.getGoldar());
        ttl.setText(profile.getTtl());
        hp.setText(profile.getTlp());
        email.setText(profile.getEmail());
        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(getView());
            }
        });
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/place/Jl.+Taman+Saturnus+I+No.45,+Manjahlega,+Kec.+Rancasari,+Kota+Bandung,+Jawa+Barat+40286/@-6.9514091,107.6757605,13.96z/data=!4m5!3m4!1s0x2e68e826d9296e2d:0xf193939c3a10be9f!8m2!3d-6.9527755!4d107.6657259");
                Intent insta = new Intent(Intent.ACTION_VIEW, uri);
                insta.setPackage("com.google.maps");
                try {
                    startActivity(insta);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/maps/place/Jl.+Taman+Saturnus+I+No.45,+Manjahlega,+Kec.+Rancasari,+Kota+Bandung,+Jawa+Barat+40286/@-6.9514091,107.6757605,13.96z/data=!4m5!3m4!1s0x2e68e826d9296e2d:0xf193939c3a10be9f!8m2!3d-6.9527755!4d107.6657259")));
                }
            }
        });
        btn_insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.instagram.com/trizky.d/");
                Intent insta = new Intent(Intent.ACTION_VIEW, uri);
                insta.setPackage("com.instagram.android");
                try {
                    startActivity(insta);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/trizky.d/")));
                }
            }
        });

        Fragment fragmentMaps = new MapsFragment();
        loadFragment(fragmentMaps);

        return view;
    }

    public void showDialog(View view) {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("About Apps");
        builder.setMessage("TrizApp V.0.0.1 BETA");
        // add a button
        builder.setPositiveButton("OK", null);
        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void loadFragment(Fragment fragment) {
        getFragmentManager().beginTransaction().replace(R.id.maps_profile,fragment).commit();
    }
}