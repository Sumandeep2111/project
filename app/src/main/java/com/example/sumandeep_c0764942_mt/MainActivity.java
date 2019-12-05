package com.example.sumandeep_c0764942_mt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView textView;
    EditText editText;
    SeekBar seekBar;
    TextView textView_seekbar;
    TextView cars;
    TextView age;
    RadioGroup  radioGroup;
    RadioButton rdbtn1;
    RadioButton rdbtn2;
    RadioButton rdbtn3;
    TextView option;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    Button amount;
    Button TotalPayment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        editText = findViewById(R.id.Rent);
        textView = findViewById(R.id.Days);
        cars = findViewById(R.id.cars);
        textView_seekbar = findViewById(R.id.seekbartext);
        age = findViewById(R.id.age);
        radioGroup = findViewById(R.id.RadioGroup);
        rdbtn1 = findViewById(R.id.btn1);
        rdbtn2 = findViewById(R.id.btn2);
        rdbtn3 = findViewById(R.id.btn3);
        option = findViewById(R.id.option);
        checkBox1 = findViewById(R.id.chk1);
        checkBox2 = findViewById(R.id.chk2);
        checkBox3 = findViewById(R.id.chk3);
        amount = findViewById(R.id.ButtonAmnt);
        TotalPayment = findViewById(R.id.ButtonTotalpay);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (spinner.getSelectedItem().toString()){
                    case "please choose a car" :
                        cars.setText("0");
                        break;
                    case "BMW" :
                        cars.setText("30");
                        break;
                    case "AUDI":
                        cars.setText("50");
                        break;
                    case "Cadillac" :
                        cars.setText("30");
                        break;
                    case "Volks Wagon" :
                        cars.setText("40");
                        break;
                    case "Mercedes":
                        cars.setText("30");
                        break;
                    case "Peugeot":
                        cars.setText("20");
                        break;
                    case "Lamborginni":
                        cars.setText("50");
                        break;
                    case "Dustor":
                        cars.setText("25");
                        break;
                    case "Nano":
                        cars.setText("30");
                        break;




                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

       radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup radioGroup, int i) {
               if(i == R.id.btn1){

               }
           }
       });


   }
}
