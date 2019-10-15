package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup gender_RadioGroup;
    private RadioButton genderButton;
    private Button chooseButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gender_RadioGroup = findViewById(R.id.gender_id);
        chooseButton =  findViewById(R.id.chooseButton_id);
        resultTextView = findViewById(R.id.result_id);

        chooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int selectedId = gender_RadioGroup.getCheckedRadioButtonId();
                    genderButton = findViewById(selectedId);

                    String value = genderButton.getText().toString();
                    resultTextView.setText(value+ " is selected");
                }
                catch(Exception e){
                    Toast.makeText(MainActivity.this, "Please select a item", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
