package com.example.ubuntu.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.view.View.OnClickListener;


/**
 * Created by ubuntu on 11/25/15.
 */
public class SearchFragment extends Fragment {
    RadioButton rdbtgoogle;
    RadioButton rdbtaskcom;
    WebView wbsearchresults;
    EditText mEditText;
    Button btGo;
    String str = "";
    Switch swImage;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_search, container, false);
        rdbtgoogle = (RadioButton)rootView.findViewById(R.id.radioButton);
        rdbtaskcom = (RadioButton)rootView.findViewById(R.id.radioButton2);
        wbsearchresults = (WebView)rootView.findViewById(R.id.webView);
        mEditText = (EditText)rootView.findViewById(R.id.editText);
        mEditText.setInputType(InputType.TYPE_CLASS_TEXT);
        swImage =(Switch) rootView.findViewById(R.id.switch1);
        btGo = (Button)rootView.findViewById(R.id.button);
        btGo.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View rootView){
//        for (int i =0; i < mEditText.getText().toString().length()-1; i++) {
//            if()
//            str = str + mEditText.getText().toString().charAt(i);
//        }
            str = mEditText.getText().toString();
            if (rdbtgoogle.isChecked()){
                rdbtaskcom.toggle();
                if (!swImage.isChecked());
                wbsearchresults.loadUrl("https://mamma.com/result/" + str +"webd ");
                if (swImage.isChecked());
                {
                    wbsearchresults.loadUrl("https://mamma.com/result/" + str + "/images");
                }
            }
            if(rdbtaskcom.isChecked()){
                rdbtgoogle.toggle();
                if (!swImage.isChecked());{
                    wbsearchresults.loadUrl("http://www.ask.com/web?q=" + str + "&qsrc=0&o=0&l=dir&qo=homepageSearchBox");
                }
                if (swImage.isChecked());{
                    wbsearchresults.loadUrl("http://www.ask.com/pictures?q=" + str + "&qsrc=1&o=0&l=dir&qo=serpSearchTopBox");}
            }
        }
        });

        return rootView;
    }

}
