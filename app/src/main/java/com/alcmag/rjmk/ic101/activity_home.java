package com.alcmag.rjmk.ic101;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.alcmag.rjmk.ic101.Utils.BottomNavviewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class activity_home extends AppCompatActivity {

    private static final String TAG = "activity_home";
    private Context mcontext=activity_home.this;
    private static final int Activity_numb=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG,"oncreate:starting");
        setupbtmnav();
    }
    private void setupbtmnav(){
        Log.d(TAG,"seetupnavigationview");
        BottomNavigationViewEx bottomNavigationViewEx=(BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavviewHelper.setupbotomview(bottomNavigationViewEx);
        BottomNavviewHelper.enablenav(mcontext,bottomNavigationViewEx);
        Menu menu  = bottomNavigationViewEx.getMenu();
        MenuItem menuItem= menu.getItem(Activity_numb);
        menuItem.setChecked(true);

    }
}
