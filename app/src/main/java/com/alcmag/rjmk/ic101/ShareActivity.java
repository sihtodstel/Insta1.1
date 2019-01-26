package com.alcmag.rjmk.ic101;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.alcmag.rjmk.ic101.R;
import com.alcmag.rjmk.ic101.Utils.BottomNavviewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class ShareActivity extends AppCompatActivity {

    private static final String TAG = "ShareActivity";
    private static final int Activity_numb=3;
    private Context mcontext=ShareActivity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: started");
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
