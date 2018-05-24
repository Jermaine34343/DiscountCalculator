package com.example.android.cuculatordiscount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //initialize here
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click = findViewById(R.id.button);
    }

    public void calc(View view){
        EditText harga = findViewById(R.id.editText2);
        EditText discount = findViewById(R.id.editText);
        TextView result = findViewById(R.id.textView3);
        double harga1 = Double.parseDouble(harga.getText().toString());
        double disc = Double.parseDouble(discount.getText().toString());

        double total = harga1 - (harga1*disc);

        result.setText("$" + harga1 + " is " + " $" + total + " after a " + disc + " discount");
    }
}
