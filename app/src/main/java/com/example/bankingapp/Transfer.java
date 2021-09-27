package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

// C:\Users\Sphep\AndroidStudioProjects\Bankingapp
public class Transfer extends AppCompatActivity {
    TextView Money;
    SeekBar transfer_seekbar;
    //developed by Sphephelo Mabena
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        Money=findViewById(R.id.money);
        transfer_seekbar=findViewById(R.id.transfer_seekbar);

        transfer_seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Money.setText("R"+ progress * 4);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            //developed by Sphephelo Mabena
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent dash=new Intent(this,Dashboard.class);
        startActivity(dash);//developed by Sphephelo Mabena
    }
}
//developed by Sphephelo Mabena