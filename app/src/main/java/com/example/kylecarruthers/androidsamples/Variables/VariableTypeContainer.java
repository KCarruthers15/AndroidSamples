package com.example.kylecarruthers.androidsamples.Variables;

import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by kylecarruthers on 2017-01-30.
 */

public class VariableTypeContainer {
    // Primitive Types
    public int integerVariable = 23;
    public long longVariable = 9223372036854775807L;
    public short shortVariable = 32767;
    public double doubleVariable = 148.37;
    public float floatVariable = 1.453428f;
    public char charVariable = 'a';
    public boolean booleanVariable = true;
    public byte byteVariable = 34;

    // Non-Primitive Types
    public String stringVariable;
    public int[] arrayVariable;
    public ArrayList<String> arrayListVariable;
    public Stack<String> stackVariable;
    public Queue<String> queueVariable;

    // Constant
    // public const int constantInt = 10;

    public enum VariableType {
        intType,
        doubleType,
        charType,
        booleanType,
        floatType
    }

    // Functions
    public int AddIntegers(int x, int y) {
        return x + y;
    }

    public int SubtractIntegers(int x, int y) {
        return x - y;
    }

    public void GetAddedIntegers() {
        integerVariable = AddIntegers(10, 5);
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
