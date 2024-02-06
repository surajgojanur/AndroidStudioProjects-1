package com.omkar.radio;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=findViewById(R.id.radioGroup);



    }
    public void checkanswer(View view)
    {
        int selectedId = rg.getCheckedRadioButtonId();
        if(R.id.radioButton3==selectedId)
        {
            Intent in=new Intent(MainActivity.this,mainactivity3.class);
            startActivity(in);
        }
        else
        {
            Intent in=new Intent(MainActivity.this,mainactivity2.class);
            startActivity(in);
        }
    }
}
