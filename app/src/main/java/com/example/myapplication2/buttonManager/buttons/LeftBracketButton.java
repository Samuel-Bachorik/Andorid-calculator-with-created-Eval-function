package com.example.myapplication2.buttonManager.buttons;

import com.example.myapplication2.MainActivity;
import com.example.myapplication2.checker.ExpressionCheck;

public class LeftBracketButton  {

    public void onClick(){
        if (ExpressionCheck.isStupidOperation(MainActivity.getExpression())) MainActivity.setExpression("" + "(");
        else {
            MainActivity.setExpression(MainActivity.getExpression() + "(");
            MainActivity.moveCursor();
        }
    }
}