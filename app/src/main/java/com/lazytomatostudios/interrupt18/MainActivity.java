package com.lazytomatostudios.interrupt18;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.lazytomatostudios.interrupt18.R;

import java.util.ArrayList;

import devlight.io.library.ntb.NavigationTabBar;
import layout.Dashboard;
import layout.Home;
import layout.Login;
import layout.Sponsors;

public class MainActivity extends AppCompatActivity implements MailInterface {

    public NavigationTabBar navigationTabBar;
    public ViewPager viewPager;
    PagerAdapter pagerAdapter;

    String mail = "null", event = "null", pass = "null";

    String TAG = "Hello";


    ArrayList<NavigationTabBar.Model> barModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initNavBar();
    }
    public void initNavBar() {

        viewPager = ( ViewPager ) findViewById(R.id.view_pager);
        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        navigationTabBar = (NavigationTabBar) findViewById(R.id.nav_tb);

        barModel = new ArrayList<>();

        barModel.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_home_black_24dp),
                        R.color.colorPrimaryDark)
                        .title("Home")
                        .badgeTitle("NTB HOME")
                        .build()
        );

        barModel.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_dashboard_black_24dp),
                        R.color.colorPrimaryDark)
                        .title("Dashboard")
                        .badgeTitle("NTB DASH")
                        .build()
        );

        barModel.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_person_black_24dp),
                        R.color.colorPrimaryDark).
                        title("Profile")
                        .badgeTitle("NTB PROF")
                        .build()
        );

        barModel.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_attach_money_black_24dp),
                        R.color.colorPrimaryDark)
                        .title("Sponsors")
                        .badgeTitle("NTB SPON")
                        .build()
        );


        navigationTabBar.setModels(barModel);
        navigationTabBar.setViewPager(viewPager, 0);

        navigationTabBar.setTitleMode(NavigationTabBar.TitleMode.ALL);
        navigationTabBar.setIsTitled(true);
        navigationTabBar.setTitleSize(20);


        navigationTabBar.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(final int position) {
                MyInterface fragment = (MyInterface) pagerAdapter.instantiateItem(viewPager, position);
                navigationTabBar.getModels().get(position).hideBadge();
                fragment.fragmentNowVisible();
                Log.d("Debug", String.valueOf(position));

            }

            @Override
            public void onPageScrollStateChanged(final int state) {

            }

        });

    }

    public void openEvent(View view) {
        Intent intent = new Intent(this, EventActivity.class);
        intent.putExtra("mail", mail);
        intent.putExtra("event", event);



        startActivity(intent);
    }



    public void openRegister(View view) {

        if(mail.equals("null")) {

            Toast.makeText(getApplicationContext(),
                    "Please sign in to register", Toast.LENGTH_LONG).show();

        } else {

            Intent intent = new Intent(this, RegisterActivity.class);
            intent.putExtra("mail", mail);
            startActivity(intent);

        }
    }


    private static class MyPagerAdapter extends FragmentPagerAdapter {

        private MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    Home home = new Home();
                    return home;
                case 1:
                    Dashboard dashboard = new Dashboard();
                    return dashboard;
                case 2:
                    return new Login();
                case 3:
                    return new Sponsors();
                default:
                    return null;
            }
        }


        @Override
        public int getCount() {
            return 4;
        }

    }


    @Override
    public void getMail(String string) {
        mail = string;
    }

    @Override
    public String sendMail() {
        return mail;
    }

    @Override
    public void storePass(String string) {
        pass = string;
    }

    @Override
    public String getPass() {
        return pass;
    }

    @Override
    public void onBackPressed()
    {
        new AlertDialog.Builder(this)
                .setTitle("Whoa there!")
                .setMessage("Are you sure you wanna get interrupted?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.super.onBackPressed();
                    }

                })
                .show();
    }

    }
