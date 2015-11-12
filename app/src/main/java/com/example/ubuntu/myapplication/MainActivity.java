package com.example.ubuntu.myapplication;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.view.View.OnClickListener;
import android.widget.Switch;

public class MainActivity extends FragmentActivity implements OnClickListener{
    RadioButton rdbtgoogle;
    RadioButton rdbtaskcom;
    WebView wbsearchresults;
    EditText mEditText;
    Button btGo;
    String str = "";
    Switch swImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        rdbtgoogle = (RadioButton)findViewById(R.id.radioButton);
        rdbtaskcom = (RadioButton)findViewById(R.id.radioButton2);
        wbsearchresults = (WebView)findViewById(R.id.webView);
        mEditText = (EditText)findViewById(R.id.editText);
        btGo = (Button)findViewById(R.id.button);
        btGo.setOnClickListener(this);
        mEditText.setInputType(InputType.TYPE_CLASS_TEXT);
        swImage =(Switch)findViewById(R.id.switch1);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onClick(View v){
//        for (int i =0; i < mEditText.getText().toString().length()-1; i++) {
//            if()
//            str = str + mEditText.getText().toString().charAt(i);
//        }
        str = mEditText.getText().toString();
        if (rdbtgoogle.isChecked()){
            rdbtaskcom.setChecked(false);
            if (!swImage.isChecked());
            wbsearchresults.loadUrl("https://mamma.com/result/" + str +"webd ");
            if (swImage.isChecked());
            {
                wbsearchresults.loadUrl("https://mamma.com/result/" + str + "/images");
            }
        }
        if(rdbtaskcom.isChecked()){
            rdbtgoogle.setChecked(false);
            if (!swImage.isChecked());{
                wbsearchresults.loadUrl("http://www.ask.com/web?q=" + str + "&qsrc=0&o=0&l=dir&qo=homepageSearchBox");
            }
            if (swImage.isChecked());{
            wbsearchresults.loadUrl("http://www.ask.com/pictures?q=" + str + "&qsrc=1&o=0&l=dir&qo=serpSearchTopBox");}
        }
    }
}
