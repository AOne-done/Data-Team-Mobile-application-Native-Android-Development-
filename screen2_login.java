package com.example.datateam;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText ;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class screen2_login extends AppCompatActivity
{
    public EditText store_e1_data ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EditText entry1 =findViewById(R.id.e1);
        String store_e1_data = entry1.getText().toString();
        EditText entry2 =findViewById(R.id.e2);
        String store_e2_data = entry2.getText().toString();

    }


}
