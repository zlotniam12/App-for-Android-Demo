package com.example.ubuntu.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.example.ubuntu.myapplication.R;

/**
 * Created by ubuntu on 11/12/15.
 */
public class CalcFragment extends Fragment {
Spinner spin;
    EditText inputOne;
    EditText inputTwo;
    TextView viewAnswer;
    TextView tv1;
    TextView tv2;
    Button gobt;
    private String[] spinloader;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calc, container, false);
        spin = (Spinner) rootView.findViewById(R.id.spinner);
        inputOne = (EditText) rootView.findViewById(R.id.etInputOne);
        inputTwo = (EditText) rootView.findViewById(R.id.etInputTwo);
        viewAnswer = (TextView) rootView.findViewById(R.id.tvAns);
        tv1 = (TextView) rootView.findViewById(R.id.textView3);
        tv2 = (TextView) rootView.findViewById(R.id.textView4);
        this.spinloader = new String[] {"Select a Calculator:", "Tip Calculator", "Fibonacci Calculator", "Meaning of Life Calculator"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, spinloader);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected (View rootView) {
                if (spin.getSelectedItem().equals("Tip Calculator:")) {
                    tv1.setText("Enter bill amount: ");
                    tv2.setText("Enter tip percentage: ");

                }
                else if (spin.getSelectedItem().equals("Fibonacci Calculator"))
                {

                }
                else if (spin.getSelectedItem().equals("Meaning of Life Calculator"))
                {

                }
            }
            public void onNothingSelected (A<String> adapter)
            {

            });

            gobt=(Button)rootView.findViewById(R.id.button2);
            gobt.setOnClickListener(new

            OnClickListener() {
                @Override
                public void onClick (View rootView){
                    if (spin.getSelectedItem().equals("Tip Calculator:")) {
                        tv1.setText("Enter bill amount: ");
                        tv2.setText("Enter tip percentage: ");
                        double answerOne = Double.parseDouble(inputOne.getText().toString());
                        double answerTwo = Double.parseDouble(inputTwo.getText().toString());
                        answerTwo *= .01;
                        answerOne *= answerTwo;
                        viewAnswer.setText(answerOne + "");
                    } else if (spin.getSelectedItem().equals("Fibonacci Calculator")) {
                        tv1.setText("Enter the Fibonacci Number you want to calculate: ");
                        tv2.setVisibility(View.INVISIBLE);
                    } else if (spin.getSelectedItem().equals("Meaning of Life Calculator")) ;
                    {
                        tv1.setVisibility(View.INVISIBLE);
                    tv2.setVisibility(View.INVISIBLE);
                    viewAnswer.setText("The ultmate answer is 42.");
                }

            }


        });
return rootView;

    }
}