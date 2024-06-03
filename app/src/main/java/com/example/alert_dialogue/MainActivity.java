package com.example.alert_dialogue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    TextView textviewe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textviewe=findViewById(R.id.textviewe);



    }

    @Override
    public void onBackPressed() {


        final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        View myview = getLayoutInflater().inflate(R.layout.design, null);
        alert.setView(myview);

        final AlertDialog dialog = alert.create();
        dialog.setCancelable(false);

        myview.findViewById(R.id.Yes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();


            }
        });

        myview.findViewById(R.id.No).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();


            }
        });

dialog.show();


    }
}