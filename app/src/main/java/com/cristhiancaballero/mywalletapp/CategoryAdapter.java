package com.cristhiancaballero.mywalletapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryAdapter {

    private ArrayList<Account> dataSet;

    public CategoryAdapter(ArrayList<Account> dataSet) {
        this.dataSet = dataSet;
    }


}
