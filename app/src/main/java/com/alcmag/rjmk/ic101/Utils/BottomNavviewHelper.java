package com.alcmag.rjmk.ic101.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.alcmag.rjmk.ic101.LikeActivity;
import com.alcmag.rjmk.ic101.ProfileActivity;
import com.alcmag.rjmk.ic101.R;
import com.alcmag.rjmk.ic101.SearchActivity;
import com.alcmag.rjmk.ic101.ShareActivity;
import com.alcmag.rjmk.ic101.activity_home;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavviewHelper {

    private static final String TAG = "BottomNavviewHelper";
    public static void setupbotomview(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG,"setting up navigation view");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);

    }
    public static void enablenav(final Context context, BottomNavigationViewEx viewEx){
        viewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_house:
                        Intent nt1=new Intent(context,activity_home.class);
                        context.startActivity(nt1);
                        break;
                    case R.id.ic_aler:
                        Intent nt2=new Intent(context,LikeActivity.class);
                        context.startActivity(nt2);
                        break;
                    case R.id.ic_android:
                        Intent nt3=new Intent(context,ProfileActivity.class);
                        context.startActivity(nt3);
                        break;
                    case R.id.ic_circle:
                        Intent nt4=new Intent(context,ShareActivity.class);
                        context.startActivity(nt4);
                        break;
                    case R.id.ic_search:
                        Intent nt5=new Intent(context,SearchActivity.class);
                        context.startActivity(nt5);
                        break;
                }
                return false;
            }
        });
    }
}
