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

        private Button button;
        private TextView textView;
        private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editTextText);
        button.setOnClickListener(new View.OnClickListener() {
           @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Conversion Completed", Toast.LENGTH_SHORT).show();
                String dayIP = editText.getText().toString();
                int days = Integer.parseInt(dayIP);
                int hours = days*24;
                String hoursOP = String.valueOf(hours);
                textView.setText("Total hours in "+days+" days is : "+hoursOP);
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
