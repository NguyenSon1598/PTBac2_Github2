package com.example.ptbac2_github;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ethesoa,ethesob,ethesoc;
    Button btnketqua;
    TextView tvketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //update commit on github
        ethesoa = (EditText)findViewById(R.id.ethesoa);
        ethesob = (EditText)findViewById(R.id.ethesob);
        ethesoc = (EditText)findViewById(R.id.ethesoc);
        btnketqua = (Button)findViewById(R.id.btnketqua);
        tvketqua=  (TextView)findViewById(R.id.tvketqua);
        btnketqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(ethesoa.getText().toString());
                int b = Integer.parseInt(ethesob.getText().toString());
                int c = Integer.parseInt(ethesoc.getText().toString());
                int delta = b*b - 4*a*c;
                if(delta<0)
                    tvketqua.setText("Vô Nghiệm");
                else if(delta==0){
                    tvketqua.setText("Nghiem: "+-b/(2*a));
                }
                else if(delta>0){
                    tvketqua.setText((-b+Math.sqrt(delta))/(2*a)+" Và " +(-b-Math.sqrt(delta))/(2*a));
                }
            }
        });
    }
}
