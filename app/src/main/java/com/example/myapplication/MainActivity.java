package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    public void OnConverterClick(View view){
        EditText editText = findViewById(R.id.editTextNumberDecimal1);
        String inputInString = editText.getText().toString();
        Double inputInDouble = Double.parseDouble(inputInString);
        Double outputInFahrenheit = (inputInDouble*9/5)+32;
        EditText editText2 = findViewById(R.id.editTextNumberDecimal2);
        editText2.setText(String.valueOf(outputInFahrenheit));

    }

    public void OnConverterClick2(View view){
        EditText editText = findViewById(R.id.editTextNumberDecimal2);
        String inputInString = editText.getText().toString();
        Double inputInDouble = Double.parseDouble(inputInString);
        Double outputInCelsius = (inputInDouble-32)*5/9;
        EditText editText2 = findViewById(R.id.editTextNumberDecimal1);
        editText2.setText(String.valueOf(outputInCelsius));

    }

    public void OnConverterClick3(View view)
    {
        EditText editText2 = findViewById(R.id.editTextNumberDecimal2);
        EditText editText1 = findViewById(R.id.editTextNumberDecimal1);
        editText2.setText("");
        editText1.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}