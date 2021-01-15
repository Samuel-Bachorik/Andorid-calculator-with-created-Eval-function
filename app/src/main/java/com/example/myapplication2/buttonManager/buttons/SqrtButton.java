package com.example.myapplication2.buttonManager.buttons;

import com.example.myapplication2.MainActivity;

public class SqrtButton {

    public void onClick(){
        try {
            MainActivity.setExpression(String.valueOf(Math.sqrt(Double.parseDouble(MainActivity.getExpression()))));
        }
        catch (Exception o) {
            MainActivity.setExpression("Stupid operation");
        }
    }
}
