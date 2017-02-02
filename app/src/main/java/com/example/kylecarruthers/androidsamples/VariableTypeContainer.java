package com.example.kylecarruthers.androidsamples;

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
    public int integerVariable = 34;
    public long longVariable = 9223372036854775807L;
    public short shortVariable = 32767;
    public double doubleVariable = 148.37;
    public float floatVariable = 1.28f;
    public char charVariable = 'a';
    public boolean booleanVariable = true;
    public byte byteVariable;

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

    public void Test() {
        int x = 32768;
        int y = 10;

        int sum = x + y;
        System.out.print(sum);

    }
}
