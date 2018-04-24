package com.example.omarlcc.convertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText cDegree = (EditText) findViewById(R.id.cDegree);
        final EditText fDegree = (EditText) findViewById(R.id.fDegree);


        Button convertor = (Button) findViewById(R.id.convertButton);

        convertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double cel = Double.valueOf(cDegree.getText().toString());
                Double result = cel * 1.8 + 32;
                String finalresult = result.toString();

                fDegree.setText(finalresult);
            }
        });

    }


}
