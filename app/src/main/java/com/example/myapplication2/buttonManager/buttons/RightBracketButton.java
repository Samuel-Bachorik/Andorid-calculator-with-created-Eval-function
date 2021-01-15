package com.example.myapplication2.buttonManager.buttons;

import com.example.myapplication2.MainActivity;
import com.example.myapplication2.checker.ExpressionCheck;

public class RightBracketButton {

    public void onClick(){
        if (MainActivity.getExpression().equals("")) return;
        if (MainActivity.getExpression().equals("Stupid operation")) return;
        if (ExpressionCheck.isStupidOperation(MainActivity.getExpression())) MainActivity.setExpression("" + ")");
        else {
            MainActivity.setExpression(MainActivity.getExpression() + ")");
            MainActivity.moveCursor();
        }
    }
}