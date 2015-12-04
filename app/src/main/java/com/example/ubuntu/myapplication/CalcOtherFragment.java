package com.example.ubuntu.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
/**
 * This class takes the form of a fragment that displays a view.
 * When the fragment is created, a TextView asks the user to select an option
 * in the spinner that is below it.
 * When the Calculate button is clicked, the program takes the selected option from the
 * spinner and returns an answer by displaying it in a separate answer TextView
 *
 * @author Alyssa Zlotnicki
 * @version 12/3/15.
 */
public class CalcOtherFragment extends Fragment{
    Spinner spin;
    String[] spinList;
    TextView viewAnswer;
    TextView tv;
    Button calcbt;
    /**
     * Creates the view to be displayed and assigns an id to it that matches the id of the xml file,
     * assigns ids to the variables that match those in the corresponding xml file,
     * and loads the spinner with values from an array of Strings.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return rootView, a View displaying the current state of the CalcOther Fragment
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_calc_other, container, false);
        viewAnswer = (TextView) rootView.findViewById(R.id.tvAns2);
        tv = (TextView) rootView.findViewById(R.id.textView5);
        spin = (Spinner) rootView.findViewById(R.id.spinner);
        this.spinList = new String[] {"The meaning of life", "The airspeed velocity of an unladen "
                + "\n" +"European swallow", "What is Chris' Birthday?"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.simple_spinner_dropdown_item, spinList);
        spin.setAdapter(adapter);
        calcbt=(Button)rootView.findViewById(R.id.button3);
        calcbt.setOnClickListener(new View.OnClickListener() {
            /**
             * Defines what happens when the button is clicked.
             * @param rootView, a view displaying the current state of the CalcOther Fragment
             */
            @Override
            public void onClick(View rootView) {

               if(spin.getSelectedItemPosition() == 0)
                viewAnswer.setText("The ultimate answer is 42");
               if(spin.getSelectedItemPosition() == 1)
                viewAnswer.setText("11 meters per second");
                if(spin.getSelectedItemPosition() == 2)
                    viewAnswer.setText("Chris' Birthday is December 5th");
            }
        });
        return rootView;
    }

}
