package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button, button2, button3, button4;
    EditText editText, editText2, editText3;
    float val1,val2,res;
    boolean add,sub,div,mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null && editText2 == null) {
                    editText.setText("");
                } else {
                    val1 = Float.parseFloat(editText.getText().toString());
                    val2 = Float.parseFloat(editText2.getText().toString());
                        editText3.setText(val1 + val2 + "");
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null && editText2 == null) {
                    editText.setText("");
                } else {
                    val1 = Float.parseFloat(editText.getText().toString());
                    val2 = Float.parseFloat(editText2.getText().toString());
                    editText3.setText(val1 - val2 + "");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null && editText2 == null) {
                    editText.setText("");
                } else {
                    val1 = Float.parseFloat(editText.getText().toString());
                    val2 = Float.parseFloat(editText2.getText().toString());
                    editText3.setText(val1 / val2 + "");
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null && editText2 == null) {
                    editText.setText("");
                } else {
                    val1 = Float.parseFloat(editText.getText().toString());
                    val2 = Float.parseFloat(editText2.getText().toString());
                    editText3.setText(val1 * val2 + "");
                }
            }
        });
    }
}