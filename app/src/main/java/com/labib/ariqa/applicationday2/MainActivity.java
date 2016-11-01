package com.labib.ariqa.applicationday2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout layout;
    private ImageView logo;
    private EditText typeText;
    private TextView correction;
    private Button enterButton;
    private String enteredText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (LinearLayout) findViewById (R.id.activity_main);
        logo = (ImageView) findViewById (R.id.androidLogo);
        typeText = (EditText) findViewById (R.id.txt_type);
        enterButton = (Button) findViewById (R.id.enterBtn);
        correction = (TextView) findViewById (R.id.correctionText);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correction.setText("");
                enteredText = typeText.getText().toString();
                if (enteredText.equalsIgnoreCase("cupcake")){
                    correction.setText("True!");
                    correction.setTextColor(Color.GREEN);
                } else {
                    correction.setText("False!");
                    correction.setTextColor(Color.RED);
                }
            }
        });
    }
}
