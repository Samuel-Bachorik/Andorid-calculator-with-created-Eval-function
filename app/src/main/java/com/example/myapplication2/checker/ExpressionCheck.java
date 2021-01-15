package com.example.myapplication2.checker;

public class ExpressionCheck {

    public static boolean check(String expression) {
        if (isStupidOperation(expression)) return false;
        if (!isEndingWithNumber(expression)) return false;
        return true;
    }

    public static boolean isStupidOperation(String expression) {
        return expression.equals("Stupid operation");
    }

    public static boolean isEndingWithNumber(String expression) {
        char endChar = expression.charAt(expression.length()-1);
        //return Character.isDigit(endChar);
        return endChar < 58 && endChar > 47; //porovnava sa to s čislom v RAM, ascii tabulka.
    }

    public static boolean isEndingWithOperator(String expression) {
        try {
            String endChar = String.valueOf(expression.charAt(expression.length()-1));
            if(endChar.equals("+")||endChar.equals("-")||endChar.equals("×")||endChar.equals("÷")||endChar.equals(".")) {
                return true;
            }
        }
        catch (Exception e){
            return false;
        }

    return false;
    }

    public static String getLastchar(String expression) {
        try{
            char endChar = expression.charAt(expression.length()-1);
            return String.valueOf(endChar);

        }
        catch (Exception b) {
            return "";
        }

    }


}