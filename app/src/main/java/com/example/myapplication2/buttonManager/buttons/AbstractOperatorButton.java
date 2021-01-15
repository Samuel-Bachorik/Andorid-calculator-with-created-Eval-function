package com.example.myapplication2.buttonManager.buttons;

import com.example.myapplication2.MainActivity;
import com.example.myapplication2.checker.ExpressionCheck;

public abstract class AbstractOperatorButton {
    private String operator;

    public AbstractOperatorButton(String operator) {
        this.operator = operator;
    }

    public void onClick() {
        if (ExpressionCheck.isEndingWithOperator(MainActivity.getExpression())||ExpressionCheck.getLastchar(MainActivity.getExpression()).equals("")||
                ExpressionCheck.isStupidOperation(MainActivity.getExpression())) ;
        else {
            MainActivity.setExpression(MainActivity.getExpression() + operator);
            MainActivity.moveCursor();
        }

    }
}

