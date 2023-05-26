package com.example.td;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android. widget. EditText;import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android. widget. EditText;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android. widget. EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText num1;
    private EditText num2;
    private Button add;
    private Button mult;
    private Button moins;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 =  findViewById(R. id.edittext1);
        num2= findViewById(R. id.edittext2);
        add=  findViewById(R. id.button_add);
        mult= findViewById(R. id.button_mult);
        moins=findViewById(R .id.button_moins);
        result= findViewById(R. id.textView);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1.getText().toString().length()==0) {
                    num1.setText("0");
                }
                if (num2.getText().toString().length()==0) {
                    num2.setText("0");
                }

                int val1 = Integer.parseInt(num1.getText().toString());
                int val2= Integer.parseInt(num2.getText().toString());
                int sum = val1+val2;
                result.setText(String.valueOf(sum));

            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1.getText().toString().length()==0) {
                    num1.setText("0");
                }
                if (num2.getText().toString().length()==0) {
                    num2.setText("0");
                }

                int val1 = Integer.parseInt(num1.getText().toString());
                int val2= Integer.parseInt(num2.getText().toString());
                int mult= val1*val2;
                result.setText(String.valueOf(moins));

            }
        });
        moins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1.getText().toString().length()==0) {
                    num1.setText("0");
                }
                if (num2.getText().toString().length()==0) {
                    num2.setText("0");
                }

                int val1 = Integer.parseInt(num1.getText().toString());
                int val2= Integer.parseInt(num2.getText().toString());
                int moins = val1-val2;
                result.setText(String.valueOf(moins));

            }
        });


    }

}