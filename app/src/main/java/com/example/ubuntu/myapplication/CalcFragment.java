package com.example.ubuntu.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View.OnClickListener;
/**
 * This class takes the form of a fragment that displays a view.
 * When the fragment is created, a TextView asks the user to enter the bill amount
 * in the box below it, and another TextView asks the user to enter the desired tip percentage
 * in the box below it.
 *
 * When the Calculate button is clicked, the program takes the values entered in both editTexts,
 * calculates the answer, and returns it by displaying it in a separate answer TextView
 *
 * @author Alyssa Zlotnicki
 * @version 12/3/15.
 */
public class CalcFragment extends Fragment {
    EditText inputOne;
    EditText inputTwo;
    TextView viewAnswer;
    TextView tv1;
    TextView tv2;
    Button calcbt;

    /**
     * Creates the view to be displayed and assigns an id to it that matches the id of the xml file,
     * assigns ids to the variables that match those in the corresponding xml file.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return rootView, a View displaying the current state of the Calc Fragment
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calc, container, false);

        inputOne = (EditText) rootView.findViewById(R.id.etInputOne);
        inputTwo = (EditText) rootView.findViewById(R.id.etInputTwo);
        viewAnswer = (TextView) rootView.findViewById(R.id.tvAns);
        tv1 = (TextView) rootView.findViewById(R.id.textView3);
        tv2 = (TextView) rootView.findViewById(R.id.textView4);
        calcbt=(Button)rootView.findViewById(R.id.button2);
        calcbt.setOnClickListener(new OnClickListener() {
            /**
             * Defines what happens when the button is clicked.
             * @param rootView, a view displaying the current state of the CalcOther Fragment
             */
                @Override
                public void onClick (View rootView){

                        tv1.setText("Enter bill amount: ");
                        tv2.setText("Enter tip percentage: ");
                        double answerOne = Double.parseDouble(inputOne.getText().toString());
                        double answerTwo = Double.parseDouble(inputTwo.getText().toString());
                        double calc;
                        answerTwo *= .01;
                        calc = answerOne + answerOne * answerTwo;

                        viewAnswer.setText(calc + "");
            }
        });
return rootView;

    }
}