package com.example.uts_akb_if3_10120102.ui.profile;

/*
 * NIM  : 10120102
 *Nama  : Fasya Mutiara Pagi
 *Kelas : IF3
 *Email : fasyamutiara12@gmail.com
 * */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

//import com.example.tugas_uts_genap_2022_akb_if2_10119084.DialogAbout;
import com.example.uts_akb_if3_10120102.DialogAbout;
import com.example.uts_akb_if3_10120102.R;

import androidx.fragment.app.Fragment;

public class FragmentProfile extends Fragment {
    TextView Abouts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_profile, container, false);


        Abouts = root.findViewById(R.id.about);



        Abouts.setOnClickListener(view -> {
            DialogAbout DialogAbout = new DialogAbout();
            DialogAbout.show(requireFragmentManager(),"Fasya Mutiara Pagi");
        });

        return root;
    }
}

