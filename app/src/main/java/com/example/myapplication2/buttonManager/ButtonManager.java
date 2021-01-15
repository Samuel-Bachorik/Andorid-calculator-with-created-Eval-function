package com.example.myapplication2.buttonManager;

import android.view.View;

import com.example.myapplication2.MainActivity;
import com.example.myapplication2.R;
import com.example.myapplication2.buttonManager.buttons.BackButton;
import com.example.myapplication2.buttonManager.buttons.ClearButton;
import com.example.myapplication2.buttonManager.buttons.DecimalPointButton;
import com.example.myapplication2.buttonManager.buttons.DivideButton;
import com.example.myapplication2.buttonManager.buttons.EightButton;
import com.example.myapplication2.buttonManager.buttons.EqualsButton;
import com.example.myapplication2.buttonManager.buttons.FiveButton;
import com.example.myapplication2.buttonManager.buttons.FourButton;
import com.example.myapplication2.buttonManager.buttons.LeftBracketButton;
import com.example.myapplication2.buttonManager.buttons.MinusButton;
import com.example.myapplication2.buttonManager.buttons.NineButton;
import com.example.myapplication2.buttonManager.buttons.OneButton;
import com.example.myapplication2.buttonManager.buttons.PlusButton;
import com.example.myapplication2.buttonManager.buttons.RightBracketButton;
import com.example.myapplication2.buttonManager.buttons.SevenButton;
import com.example.myapplication2.buttonManager.buttons.SixButton;
import com.example.myapplication2.buttonManager.buttons.SqrtButton;
import com.example.myapplication2.buttonManager.buttons.ThreeButton;
import com.example.myapplication2.buttonManager.buttons.TimesButton;
import com.example.myapplication2.buttonManager.buttons.TwoButton;
import com.example.myapplication2.buttonManager.buttons.ZeroButton;

import java.sql.Time;

public class ButtonManager {
    // number buttons
    private ZeroButton zeroButton;
    private OneButton oneButton;
    private TwoButton twoButton;
    private ThreeButton threeButton;
    private FourButton fourButton;
    private FiveButton fiveButton;
    private SixButton sixButton;
    private SevenButton sevenButton;
    private EightButton eightButton;
    private NineButton nineButton;

    // operation buttons
    private PlusButton plusButton;
    private DivideButton divideButton;
    private MinusButton minusButton;
    private TimesButton timesButton;
    private EqualsButton equalsButton;

    // Clear buttons
    private ClearButton clearButton;
    private BackButton backButton;

    //Brackets buttons
    private LeftBracketButton leftBracketButton;
    private RightBracketButton rightBracketButton;

    // Sqrt button
    private SqrtButton sqrtButton;

    // Decimal point button
    private DecimalPointButton decimalPointButton;

    public ButtonManager() {  //konštruktor hned ako vznikne z triedy objekt sa konštruktor pusti / vznikne/ new butonmanager

        // number buttons
        zeroButton = new ZeroButton();
        oneButton = new OneButton();
        twoButton = new TwoButton();
        threeButton = new ThreeButton();
        fourButton = new FourButton();
        fiveButton = new FiveButton();
        sixButton = new SixButton();
        sevenButton = new SevenButton();
        eightButton = new EightButton();
        nineButton = new NineButton();

        //Brackets buttons
        leftBracketButton = new LeftBracketButton();
        rightBracketButton = new RightBracketButton();

        // Clear buttons
        clearButton = new ClearButton();
        backButton = new BackButton();

        // Operation buttons
        equalsButton = new EqualsButton();
        plusButton = new PlusButton();
        minusButton = new MinusButton();
        divideButton = new DivideButton();
        timesButton = new TimesButton();

        // Sqrt button
        sqrtButton = new SqrtButton();

        // Decimal point button
        decimalPointButton = new DecimalPointButton();

    }
    public void onButtonClick(View view) {
        switch (view.getResources().getResourceEntryName(view.getId())) {
            //Number buttons
            case "zero": zeroButton.onClick(); break;
            case "one": oneButton.onClick(); break;
            case "two": twoButton.onClick(); break;
            case "three": threeButton.onClick(); break;
            case "four": fourButton.onClick(); break;
            case "five": fiveButton.onClick(); break;
            case "six": sixButton.onClick(); break;
            case "seven": sevenButton.onClick(); break;
            case "eight": eightButton.onClick(); break;
            case "nine": nineButton.onClick(); break;

            // Operation buttons
            case "plus": plusButton.onClick(); break;
            case "minus": minusButton.onClick(); break;
            case "divide": divideButton.onClick(); break;
            case "times": timesButton.onClick(); break;
            case "equals": equalsButton.onClick(); break;

            // Clear buttons
            case "clear": clearButton.onClick(); break;
            case "back": backButton.onClick(); break;

            // Bracket buttons
            case "left": leftBracketButton.onClick(); break;
            case "right": rightBracketButton.onClick(); break;

            // Sqrt button
            case "sqrt": sqrtButton.onClick(); break;

            // Decimal point button
            case "decimalPoint": decimalPointButton.onClick(); break;

            // Default
            default:
                MainActivity.setExpression("Unknown button: "+ view.getId());
        }
    }
}