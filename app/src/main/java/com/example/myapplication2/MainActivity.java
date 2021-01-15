package com.example.myapplication2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication2.buttonManager.ButtonManager;
import com.example.myapplication2.checker.ExpressionCheck;

public class MainActivity extends AppCompatActivity {
    private static EditText resultBar;
    private static ButtonManager buttonManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultBar = findViewById(R.id.resultBar);
        buttonManager = new ButtonManager();
    }

    public static void onButtonClick(View view) {
        buttonManager.onButtonClick(view);
    }

    public static boolean checkExression() {
        return ExpressionCheck.check(resultBar.getText().toString());
    }

    public static void setExpression(String expression) {
        resultBar.setText(expression);
    }

    public static String getExpression() {
        return resultBar.getText().toString();
    }

    public static void moveCursor() {
        if (MainActivity.getExpression().length()>15) {
            resultBar.setSelection(resultBar.getText().length());
        }
    }
}