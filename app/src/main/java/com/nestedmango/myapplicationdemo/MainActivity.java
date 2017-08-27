package com.nestedmango.myapplicationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnSave;
    CheckBox checkbox;
    EditText edtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSave=(Button)findViewById(R.id.buttonSave);
        checkbox=(CheckBox)findViewById(R.id.checkBox1);
        edtName=(EditText)findViewById(R.id.editTextName);

    }
    public void goToOnNextPage(View v){
        Intent i=new Intent(getApplication(),InfoActivity.class);
        startActivity(i);

    }
}
