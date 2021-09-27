package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
//developed by Sphephelo Mabena
public class ElectronicFunds extends AppCompatActivity {


    //developed by Sphephelo Mabena
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic_funds);


    }
    @Override
    public void onBackPressed() {
        Intent dash=new Intent(this,Dashboard.class);
        startActivity(dash);
    }
}
//developed by Sphephelo Mabena