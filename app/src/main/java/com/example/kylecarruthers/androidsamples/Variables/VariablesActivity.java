package com.example.kylecarruthers.androidsamples.Variables;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.kylecarruthers.androidsamples.R;

public class VariablesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variables);

        Intent intent = getIntent();

    }

    public void onVariableExamplePress(View view) {
        System.out.print("Press!");
    }

}
