package com.example.rtu_student_portal.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.rtu_student_portal.R;

public class student_master_file1 extends AppCompatActivity {

    EditText etSTName;
    EditText etSN;
    EditText etFN;
    EditText etMN;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smf);
        etSTName=findViewById(R.id.etSTName);
        etFN=findViewById(R.id.etFN);
        etSN=findViewById(R.id.etSN);
        etMN=findViewById(R.id.etMN);
        btnSubmit=findViewById(R.id.btnSubmit);
        // Dropdown Student ID
        Spinner mySpinner =(Spinner) findViewById(R.id.SpnrSB);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(student_master_file1.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.batch));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        // Dropdown Student class
        Spinner mySpinner1 =(Spinner) findViewById(R.id.SpnrSC);

        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(student_master_file1.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.sclass));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner1.setAdapter(myAdapter1);

        //Dropdown Province/Origin
        Spinner mySpinner2 =(Spinner) findViewById(R.id.SpnrPO);

        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(student_master_file1.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.sprovince));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(myAdapter2);

        // Dropdown Student Religion
        Spinner mySpinner4 =(Spinner) findViewById(R.id.SpnrRlgn);
        ArrayAdapter<String> myAdapter4 = new ArrayAdapter<String>(student_master_file1.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.sreligion));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner4.setAdapter(myAdapter4);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etSTName.getText().toString().trim();
                Toast.makeText(student_master_file1.this, "Information Saved", Toast.LENGTH_SHORT).show();
            }
        });

    }
}