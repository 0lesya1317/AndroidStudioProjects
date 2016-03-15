package com.example.lexia.hw1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton work, relax, napping;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);

        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if(checkedId == R.id.napping) {
                    Toast.makeText(getApplicationContext(), "choice: Have a nap",
                            Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.work) {
                    Toast.makeText(getApplicationContext(), "choice: Work",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "choice: Relax",
                            Toast.LENGTH_SHORT).show();
                }
            }

        });

        work = (RadioButton) findViewById(R.id.work);
        relax = (RadioButton) findViewById(R.id.relax);
        napping = (RadioButton) findViewById(R.id.napping);
        textView = (TextView) findViewById(R.id.text);

        button = (Button) findViewById(R.id.chooseBtn);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find which radioButton is checked by id
                if (selectedId == work.getId()) {
                    textView.setText("You chose 'Work' option");
                } else if(selectedId == relax.getId()) {
                    textView.setText("You chose 'Relax' option");
                } else {
                    textView.setText("You chose 'Have a nap' option");
                }
            }
        });
    }

}