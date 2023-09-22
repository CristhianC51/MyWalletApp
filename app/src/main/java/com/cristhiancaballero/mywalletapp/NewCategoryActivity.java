package com.cristhiancaballero.mywalletapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import yuku.ambilwarna.AmbilWarnaDialog;


public class NewCategoryActivity extends AppCompatActivity {
    private TextView colorDisplay;
    private int selectedColor = Color.BLACK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_category);


        colorDisplay = findViewById(R.id.colorDisplay);
        Button colorPickerButton = findViewById(R.id.colorPickerButton);

        colorPickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showColorPickerDialog();
            }
        });
    }

    private void showColorPickerDialog() {

        AmbilWarnaDialog colorPickerDialog = new AmbilWarnaDialog(this, selectedColor, new   AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                selectedColor = color;
                updateColorDisplay();
            }

            @Override
            public void onCancel(AmbilWarnaDialog dialog) {
                // El usuario ha cancelado la selección de color
            }
        });

        colorPickerDialog.show();
    }

    private void updateColorDisplay() {
        String hexColor = String.format("#%06X", (0xFFFFFF & selectedColor));
        colorDisplay.setBackgroundColor(selectedColor);
        colorDisplay.setText("Color seleccionado: " + hexColor);
    }
}








