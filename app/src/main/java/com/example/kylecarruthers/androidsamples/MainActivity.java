package com.example.kylecarruthers.androidsamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Button Click for Variable Example button
    public void onVariableExamplePress(View view) {
        Intent goToVarExample = new Intent(this, VariablesActivity.class);
        startActivity(goToVarExample);

        // Get a control from the UI
        // Button btn = (Button)findViewById(R.id.variables_button);
    }
}
