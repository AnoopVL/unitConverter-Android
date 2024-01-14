package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private Button hourButton;
        private  Button minuteButton;
        private Button secondsButton;
        private EditText daysInput;
        private TextView hourTextView;
        private TextView minuteTextView;
        private TextView secondsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        daysInput = findViewById(R.id.daysInput);
        hourButton = findViewById(R.id.hourButton);
        minuteButton = findViewById(R.id.minuteButton);
        secondsButton = findViewById(R.id.secondsButton);
        hourTextView = findViewById(R.id.hourTexView);
        minuteTextView = findViewById(R.id.minuteTexView);
        secondsTextView = findViewById(R.id.secondsTextView);

        hourButton.setOnClickListener(new View.OnClickListener() {
           @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Conversion Completed", Toast.LENGTH_SHORT).show();
                String dayIP = daysInput.getText().toString();
                int days = Integer.parseInt(dayIP);
                int hours = days*24;
                String hoursOP = String.valueOf(hours);
                hourTextView.setText("Total hours in "+days+" days is : "+hoursOP);
            }
        });
        minuteButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Conversion Completed", Toast.LENGTH_SHORT).show();
                String dayIP = daysInput.getText().toString();
                int days = Integer.parseInt(dayIP);
                int minutes = days*1440;
                String hoursOP = String.valueOf(minutes);
                hourTextView.setText("Minutes: "+minutes);
            }
        });
        secondsButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Conversion Completed", Toast.LENGTH_SHORT).show();
                String dayIP = daysInput.getText().toString();
                int days = Integer.parseInt(dayIP);
                int seconds = days*86400;
                String hoursOP = String.valueOf(seconds);
                hourTextView.setText("Seconds: "+seconds);
            }
        });
    }
//    private void hideKeyboard() {
//        View view = this.getCurrentFocus();
//        if (view != null) {
//            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
//            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
//        }
//    }

}
