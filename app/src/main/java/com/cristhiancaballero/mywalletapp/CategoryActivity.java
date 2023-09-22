package com.cristhiancaballero.mywalletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {

    private ArrayList<Category> listCategoryRV = new ArrayList<>();
    private RecyclerView rvListCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        loadFakeData();
        rvListCategory = findViewById(R.id.rv_category);

        CategoryAdapter myAdapter = new CategoryAdapter(listCategoryRV);
        rvListCategory.setAdapter(myAdapter);

        rvListCategory.setLayoutManager(new LinearLayoutManager(CategoryActivity.this));
    }

    private void loadFakeData() {
        Category myCategory1 = new Category("A", "A", "A");
        Category myCategory2 = new Category("A", "A", "A");
        Category myCategory3 = new Category("A", "A", "A");

        listCategoryRV.add(myCategory1);
        listCategoryRV.add(myCategory2);
        listCategoryRV.add(myCategory3);
    }
}