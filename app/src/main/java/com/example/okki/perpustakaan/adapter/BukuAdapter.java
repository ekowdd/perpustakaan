package com.example.okki.perpustakaan.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.okki.perpustakaan.R;
import com.example.okki.perpustakaan.model.BukuModel;

import java.util.List;

/**
 * Created by OKKI on 12/06/2017.
 */

public class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.Viewholder> {
    private View view;
    private Context context;
    private Activity activity;
    private List<BukuModel> list;

    public BukuAdapter(List<BukuModel> list,Activity activity,Context context) {
        this.context = context;
        this.activity = activity;
        this.list = list;
    }

    @Override
    public BukuAdapter.Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listbuku,null);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(BukuAdapter.Viewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public Viewholder(View itemView) {
            super(itemView);
        }
    }
}
