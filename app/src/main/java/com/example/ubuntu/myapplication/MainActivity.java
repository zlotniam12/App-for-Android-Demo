package com.example.ubuntu.myapplication;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
/**
 * The MainActivity defines what is viewed on all other activities, handling the viewing of each
 * activity in its fragment with a viewPage. It also defines what what happens when option in the
 * main menu on the toolbar, which is visble in all fragments, is clicked.
 *
 * @author Alyssa Zlotnicki
 * @version 12/3/15.
 */

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabsPagerAdapter tpAdapter;
    ViewPager mViewPager;
    SlidingTabLayout tabLayout;
    private String[] tabs = {"Search", "Calculate Tips", "Calculate Other Things"};
    private int tabsNum = 3;

    /**
     * Defines what happens when the app is opened up, and the first view the user
     * sees is created. This is where the defining of what what is displayed on each tab
     * is accomplished
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
       tpAdapter = new TabsPagerAdapter(getSupportFragmentManager(), tabs, tabsNum);
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(tpAdapter);
        tabLayout = (SlidingTabLayout) findViewById(R.id.tabs);
        tabLayout.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width
        tabLayout.setViewPager(mViewPager);

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
        switch (item.getItemId()) {
            case R.id.action_settings: {
                return true;
            }
            case R.id.action_appcreator:
                Toast.makeText(getApplicationContext(), "Alyssa Zlotnicki is the app creator", Toast.LENGTH_LONG).show();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
