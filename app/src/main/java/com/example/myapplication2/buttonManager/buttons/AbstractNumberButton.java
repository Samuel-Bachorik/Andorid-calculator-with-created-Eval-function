package com.example.myapplication2.buttonManager.buttons;

import com.example.myapplication2.MainActivity;
import com.example.myapplication2.checker.ExpressionCheck;

public abstract class AbstractNumberButton {
    private int number;

    public AbstractNumberButton(int number) {
        this.number = number;
    }

    public void onClick() {
        if (ExpressionCheck.isStupidOperation(MainActivity.getExpression())) MainActivity.setExpression("" + number);
        else {
            MainActivity.setExpression(MainActivity.getExpression() + number);
        }
    }
}