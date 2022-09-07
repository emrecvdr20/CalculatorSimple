 package com.emrecavdar.calculatorsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

     EditText editTextTextPersonName;
     EditText editTextTextPersonName2;
     TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName =findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);
        textView2=findViewById(R.id.textView2);
    }

    public void sum(View view){
        if (editTextTextPersonName.getText().toString().matches("") || editTextTextPersonName2.getText().toString().matches("")){
            textView2.setText("Enter Number!");
        }else {
            int number1=Integer.parseInt(editTextTextPersonName.getText().toString());
            int number2=Integer.parseInt(editTextTextPersonName2.getText().toString());
            int result=number1+number2;
            textView2.setText("Sonuc:" + result);
        }
    }

    public void extraction(View view){
        if (editTextTextPersonName.getText().toString().matches("") || editTextTextPersonName2.getText().toString().matches("")){
            textView2.setText("Enter Number!");
        }else {
            int number1=Integer.parseInt(editTextTextPersonName.getText().toString());
            int number2=Integer.parseInt(editTextTextPersonName2.getText().toString());
            int result=number1-number2;
            textView2.setText("Sonuc:" + result);
        }
    }

    public void impact(View view){
        if (editTextTextPersonName.getText().toString().matches("") || editTextTextPersonName2.getText().toString().matches("")){
            textView2.setText("Enter Number!");
        }else {
            int number1=Integer.parseInt(editTextTextPersonName.getText().toString());
            int number2=Integer.parseInt(editTextTextPersonName2.getText().toString());
            int result=number1*number2;
            textView2.setText("Sonuc:" + result);
        }
    }

    public void divide(View view){
        if (editTextTextPersonName.getText().toString().matches("") || editTextTextPersonName2.getText().toString().matches("")){
            textView2.setText("Enter Number!");
        }else {
            int number1=Integer.parseInt(editTextTextPersonName.getText().toString());
            int number2=Integer.parseInt(editTextTextPersonName2.getText().toString());
            int result=number1/number2;
            textView2.setText("Sonuc:" + result);
        }
    }
}