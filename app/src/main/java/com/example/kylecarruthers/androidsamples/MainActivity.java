package com.example.kylecarruthers.androidsamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.kylecarruthers.androidsamples.Variables.VariablesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main();
    }

    // Button Click for Variable Example button
    public void onVariableLessonPress(View view) {
        Intent goToVarExample = new Intent(this, VariablesActivity.class);
        startActivity(goToVarExample);

        // Get a control from the UI
        // Button btn = (Button)findViewById(R.id.variables_button);
    }

    public void main() {
        int x = 5;
        int y = 10;
        AddTwoNumbers(x, y);

    }

    public void AddTwoNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;

        System.out.print(sum);
    }
}
