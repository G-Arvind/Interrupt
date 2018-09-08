package com.example.arvind.svceinterrupt;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;
import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class Splash extends AwesomeSplash {


    @Override
    public void initSplash(ConfigSplash configSplash) {

        //getSupportActionBar().hide();
        //  getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        configSplash.setBackgroundColor(R.color.colorPrimary);
        configSplash.setAnimCircularRevealDuration(1000);
        configSplash.setRevealFlagX(Flags.REVEAL_LEFT);
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM);

        configSplash.setLogoSplash(R.drawable.logo);

        configSplash.setAnimLogoSplashDuration(1000);
        //configSplash.setAnimLogoSplashTechnique(Techniques.BounceInDown);
        configSplash.setAnimLogoSplashTechnique(Techniques.FadeInRight);
        configSplash.setOriginalHeight(10);
        configSplash.setOriginalWidth(10);


        configSplash.setTitleSplash("Interrupt'18");
        configSplash.setTitleTextColor(R.color.colorPrimaryDark);
        configSplash.setAnimTitleDuration(1000);
        configSplash.setTitleFont("fonts/monts.ttf");
        // configSplash.setTitleFont(getString(R.string.Font));
        configSplash.setTitleTextSize(30f);
        configSplash.setAnimTitleTechnique(Techniques.FlipInX);
    }

    @Override
    public void animationsFinished() {
        startActivity(new Intent(Splash.this,MainActivity.class));
        finish();
    }


}

