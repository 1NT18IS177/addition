package com.example.addition177;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView sum;
    Button addition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        sum = (TextView) findViewById(R.id.sum);
        addition = (Button) findViewById(R.id.add);

        Intent result = new Intent(this, additionResult.class);

        addition.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int Sum = a + b;
                sum.setText(Integer.toString(Sum));

                result.putExtra("Result", Integer.toString(Sum));
                startActivity(result);
            }
        });
    }

}

