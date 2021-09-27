package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class Limit extends AppCompatActivity {
    SeekBar amount_seekbar;
    TextView amount_limit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limit);

        amount_seekbar=findViewById(R.id.Amount_seekbar);
        amount_limit=findViewById(R.id.Amount_Limit);

        amount_seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                amount_limit.setText("R"+progress *4);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent dash=new Intent(this,Dashboard.class);
        startActivity(dash);
    }
}
