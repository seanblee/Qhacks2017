package com.seanlee.ease;


/**
 * Created by daria on 2017-02-04.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class IntroActivity extends AppIntro {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        addSlide(AppIntroFragment.newInstance("yes","helllo",R.drawable.coffee_image, ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("yes","helllo",R.drawable.arrow, ContextCompat.getColor(getApplicationContext(),R.color.colorAccent)));
        addSlide(AppIntroFragment.newInstance("yes","helllo",R.drawable.logo, ContextCompat.getColor(getApplicationContext(),R.color.colorAccent)));

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}
