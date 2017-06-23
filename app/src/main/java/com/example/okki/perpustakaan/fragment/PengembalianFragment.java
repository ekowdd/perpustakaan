package com.example.okki.perpustakaan.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.okki.perpustakaan.R;

/**
 * Created by OKKI on 12/06/2017.
 */

public class PengembalianFragment extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.pengembalian_fragment,container,false);
        return view;
    }
}
