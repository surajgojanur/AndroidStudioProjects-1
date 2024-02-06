package com.omkar.checkbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3,c4;
    Button b1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.checkBox);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        c4=findViewById(R.id.checkBox4);
    }
    public void order(View v){
        int total_amt=0;
        StringBuilder result=new StringBuilder();
        result.append("Selected Items : ");
        if(c1.isChecked()){
            result.append("Curd Rice 60rs");
            total_amt+=60;
        }
        if(c2.isChecked()){
            result.append("South Indian Thali 140rs");
            total_amt+=140;
        }
        if(c3.isChecked()){
            result.append("Veg Roll 70rs");
            total_amt+=70;
        }
        if(c4.isChecked()){
            result.append("Dahi Papdi Chat 80rs");
            total_amt+=80;
        }

        result.append("Total : "+total_amt+ "Rs");
        Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show();
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage(result.toString());
        dialog.show();
    }
}