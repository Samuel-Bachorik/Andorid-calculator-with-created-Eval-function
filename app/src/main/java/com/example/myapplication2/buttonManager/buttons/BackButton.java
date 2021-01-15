package com.example.myapplication2.buttonManager.buttons;

import com.example.myapplication2.MainActivity;

public class BackButton {

    public void onClick(){
        try {
            MainActivity.setExpression(MainActivity.getExpression().substring(0, MainActivity.getExpression().length() - 1));
        }
        catch (Exception j){
            ;
        }
    }
}