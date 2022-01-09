package dev.masoodahmad.units_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//     Adding the important variables that will be used
    private Button kgToPoundButton;
    private Button poundToKgButton;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kgToPoundButton = findViewById(R.id.button);
        poundToKgButton = findViewById(R.id.button2);
        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView3);

        kgToPoundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Kg To Pound button clicked", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                double kg = Integer.parseInt(s);
                double pound = kg * 2.205;
                String strPound = String.format("%.2f", pound);
                textView.setText("The Pound value of the value you entered is: " + strPound);
            }
        });

        poundToKgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pound to Kg button clicked", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                double pound = Integer.parseInt(s);
                double kg = pound /2.205;
                String strKg = String.format("%.2f", kg);
                textView.setText("The Kg value of the value you entered is: " + strKg);
            }
        });
    }
}