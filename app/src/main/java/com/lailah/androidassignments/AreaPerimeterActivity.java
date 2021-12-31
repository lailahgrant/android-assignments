package com.lailah.androidassignments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AreaPerimeterActivity extends AppCompatActivity {

    //variable declaration
    EditText radius;
    TextView myResult;
    Button btnArea;
    Button btnPerimeter;
    Button btnBack;
    Button btnExit;

    double r=0,area=0,per=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_perimeter);

       //set a value to variables
        radius=(EditText)findViewById(R.id.editText);
        myResult=(TextView)findViewById(R.id.textView3);
        btnArea=(Button)findViewById(R.id.button);
        btnPerimeter=(Button)findViewById(R.id.button2);
        btnBack=(Button)findViewById(R.id.button3);
        btnExit=(Button)findViewById(R.id.button5);

        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //add voolean for validation
                boolean isValidate=true;

                //condition if input is empty,  getText() - for reading input
                if(radius.getText().toString().length() <= 0){
                    radius.setError("Value is required");

                    isValidate=false;
                }

                //if condition is ok - if user enters value greater than 0
                if(isValidate){

                    //convert inetger r to double to string
                    r=Double.parseDouble(radius.getText().toString());
                    area=3.142*r*r;

                    //convert area reult back to string inorder to display it on label
                    myResult.setText(Double.toString(area));

                    //craete a toast
                    Toast.makeText(getApplicationContext(),String.valueOf(area),Toast.LENGTH_LONG).show();

                }

            }
        });

        //code for perimeter
        btnPerimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //add voolean for validation
                boolean isValidate=true;

                //condition if input is empty,  getText() - for reading input
                if(radius.getText().toString().length() <= 0){
                    radius.setError("Value is required");

                    isValidate=false;
                }

                //if condition is ok - if user enters value greater than 0
                if(isValidate){

                    //convert inetger r to double to string
                    r=Double.parseDouble(radius.getText().toString());
                    per=2*3.142*r;

                    //convert area reult back to string inorder to display it on label
                    myResult.setText(Double.toString(per));

                    //craete a toast
                    Toast.makeText(getApplicationContext(),String.valueOf(per),Toast.LENGTH_LONG).show();

                }

            }
        });

        //code for back button
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent class calls the mainActivity to run when back button is clicked
                Intent i = new Intent(v.getContext(), MainActivity.class);
                v.getContext().startActivity(i);

            }
        });

    }
}
