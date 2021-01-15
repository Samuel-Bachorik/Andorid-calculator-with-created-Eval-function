package com.example.myapplication2.buttonManager.buttons;

import com.example.myapplication2.Calculator;
import com.example.myapplication2.MainActivity;

public class EqualsButton {
    public static void onClick() {

        try {
            MainActivity.setExpression(Calculator.eval(MainActivity.getExpression()));
        }

        catch (Exception n) {
            MainActivity.setExpression("Stupid operation");
        }
    }
}