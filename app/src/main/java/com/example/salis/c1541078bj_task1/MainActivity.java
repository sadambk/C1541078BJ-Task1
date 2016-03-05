package com.example.salis.c1541078bj_task1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText EditTextInput;
    Button btn;
    TextView txtLenght;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditTextInput= (EditText)findViewById(R.id.editText);

        txtLenght = (TextView)findViewById(R.id.textView2);

        btn = (Button)findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = Integer.parseInt(EditTextInput.getText().toString());
                if (length == txtLenght.getText().toString().length() )
                {
                    Toast.makeText(getApplicationContext(), "Your Guess is correct", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Your Guess is wrong!!!", Toast.LENGTH_LONG).show();
            }
        }


});
    }
}