package com.example.herotruth.dialups;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = findViewById(R.id.button2);


        btnSend.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {

                AlertDialog.Builder dialog= new AlertDialog.Builder
                        (MainActivity.this);

                dialog.setTitle("Dialog Box");
                dialog.setMessage("Do you want to continue?");
                dialog.setPositiveButton
                (
                    "OK",
                    new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int whhich)
                            {
                                LayoutInflater layoutInflater = getLayoutInflater();
                                View myView = layoutInflater.inflate(R.layout.example_layout, null);
                                Toast myToast = new Toast (MainActivity.this);
                                myToast.setDuration(Toast.LENGTH_LONG);
                                myToast.setGravity(Gravity.CENTER, 0, 0);
                                myToast.show();
                            }
                        });

                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        finish();
                    }
                });

                dialog.show();
            }
        });
    }
}
