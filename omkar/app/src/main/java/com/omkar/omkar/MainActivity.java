package com.omkar.omkar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder ab=new
                        AlertDialog.Builder(MainActivity.this);
                ab.setTitle("Exit Alert");
                ab.setMessage("Are you Sure you want to Exit");
                ab.setCancelable(false);
                ab.setPositiveButton("YES", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int
                                    i) {
                                Toast.makeText(MainActivity.this, "Selected Option : YES", Toast.LENGTH_SHORT).show();
                                        finish();
                            }
                        });
                ab.setNegativeButton("NO", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int
                                    i) {
                                Toast.makeText(MainActivity.this, "Selected Option NO", Toast.LENGTH_SHORT).show();
                                        dialogInterface.dismiss();
                            }
                        });
                ab.show();
            }
        });
    }
}
