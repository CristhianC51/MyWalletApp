package com.cristhiancaballero.mywalletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV = new ArrayList<>();
    private RecyclerView rvListAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();
        rvListAccount = findViewById(R.id.rv_account);

        AccountAdapter myAdapter = new AccountAdapter(listAccountRV);
        rvListAccount.setAdapter(myAdapter);

        rvListAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));
    }

    private void loadFakeData() {
        Account myAccount1 = new Account("Bancolombia", "Cuenta Corriente", 10000.0, "https://staticprd.minuto30.com/wp-content/uploads/2018/03/logo-bancolombia-Copiar.jpg");
        Account myAccount2 = new Account("Davivienda", "Cuenta Ahorros", 20000.0, "www.grupobolivar.com.co/wps/wcm/connect/f1306a3a-f363-44f3-9a0b-9971917c4c27/davivienda.jpg");
        Account myAccount3 = new Account("Banco Bogota", "Tarjeta Credito", 30000.0, "https://is1-ssl.mzstatic.com/image/thumb/Purple116/v4/2c/64/9f/2c649f4e-a72d-8720-ecdc-e3e996df9958/AppIcon-bbta-1x_U007emarketing-0-10-0-85-220.png/1024x1024.jpg");

        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
    }
}