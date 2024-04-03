package com.example.project4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragment3 extends Fragment {

    private RecyclerView  Rev;
    private RecyclerView.Adapter An;
    private RecyclerView.LayoutManager layout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, container, false);

        Rev = view.findViewById(R.id.r);
        Rev.setHasFixedSize(true);

        layout = new LinearLayoutManager(getContext());
        Rev.setLayoutManager(layout);

        String[] data = new String[200];
        for (int i = 0; i < 200; i++) {
            data[i] = "Предмет " + (i + 1);
        }
        An = new Adapter(getActivity(), data);
        Rev.setAdapter(An);

        return view;
    }
}

























