package com.example.myapplication2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumChecker {
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}