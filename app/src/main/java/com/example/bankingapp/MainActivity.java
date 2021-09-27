package com.example.bankingapp;
//developed by Sphephelo Mabena
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//developed by Sphephelo Mabena

public class MainActivity extends AppCompatActivity {
    //developed by Sphephelo Mabena
    String correct_username="Sphe";
    int correct_password=1234;
    EditText password,username;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password=findViewById(R.id.Password);
        username=findViewById(R.id.Username);
        login=findViewById(R.id.Btn_Login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String given_username=username.getText().toString();
                int given_password=Integer.parseInt(password.getText().toString());*/

               /* if ((correct_username.equals(given_username)) && (correct_password == given_password)) {


                    NotificationManagerCompat notiman = NotificationManagerCompat.from(MainActivity.this);

                    Notification notification = new NotificationCompat.Builder(MainActivity.this, LoginNotification.id)
                            .setSmallIcon(R.drawable.buttons)
                            .setContentTitle("Login Successful")
                            .setContentText("You have managed to login successfullly")
                            .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                            .setPriority(NotificationCompat.PRIORITY_HIGH)
                            .build();
                    notiman.notify(1, notification);
                    Intent homepage = new Intent(MainActivity.this, Dashboard.class);
                    startActivity(homepage);
                }*/
                NotificationManagerCompat notiman = NotificationManagerCompat.from(MainActivity.this);
//developed by Sphephelo Mabena
                Notification notification = new NotificationCompat.Builder(MainActivity.this, LoginNotification.id)
                        .setSmallIcon(R.drawable.buttons)
                        .setContentTitle("Login Successful")
                        .setContentText("You have managed to login successfullly")
                        .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .build();
                notiman.notify(1, notification);
                Intent homepage = new Intent(MainActivity.this, Dashboard.class);
                startActivity(homepage);
//developed by Sphephelo Mabena
            }
        });
    }
}
//developed by Sphephelo Mabena