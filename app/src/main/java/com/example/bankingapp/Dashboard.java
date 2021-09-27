package com.example.bankingapp;
//developed by Sphephelo Mabena
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//developed by Sphephelo Mabena
public class Dashboard extends AppCompatActivity {
    ConstraintLayout Balance,Transfer,Limit,Efunds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Balance=findViewById(R.id.Balance);
        Transfer=findViewById(R.id.Transfer);
        Limit=findViewById(R.id.Limit);
        Efunds=findViewById(R.id.E_Funds);

        Balance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent balance=new Intent(Dashboard.this,Balance.class);
                startActivity(balance);
            }
        });

        Transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent transfer=new Intent(Dashboard.this,Transfer.class);
                startActivity(transfer);
            }
        });

        Limit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent limit=new Intent(Dashboard.this,Limit.class);
                startActivity(limit);
//developed by Sphephelo Mabena

            }
        });
        Efunds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent efunds=new Intent(Dashboard.this,ElectronicFunds.class);
                startActivity(efunds);
            }
        });
    }
}
//developed by Sphephelo Mabena