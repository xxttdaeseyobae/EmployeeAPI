package com.softwarica.employeeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class UpdateDeleteActivity extends AppCompatActivity {

    EditText etSearch, etName, etSalary, etAge;
    Button btnSearch, btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_delete);

        etSearch = findViewById(R.id.etSearch);
        etName = findViewById(R.id.etName);
        etSalary = findViewById(R.id.etSalary);
        etAge = findViewById(R.id.etAge);
        btnSearch = findViewById(R.id.btnSearch);
        btnUpdate = findViewById(R.id.btnUpdate);
    }
}
