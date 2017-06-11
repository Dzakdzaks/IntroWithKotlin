package com.example.admin.appintro

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.Toast
import com.github.paolorotolo.appintro.AppIntro
import com.github.paolorotolo.appintro.AppIntroFragment
import com.project.dzakdzak.introwithkotlin.R

class Intro : AppIntro() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addSlide(AppIntroFragment.newInstance("Hello Food!", "The easiest way to order your favourite food!", R.drawable.cat1, Color.parseColor("#f64c73")))
        addSlide(AppIntroFragment.newInstance("Great Discounts", "Great Discounts and low rates on every Single service we offer!", R.drawable.cat2, Color.parseColor("#20d2bb")))
        addSlide(AppIntroFragment.newInstance("Movie Tickets!", "Book the movie tickets for your friends and family!", R.drawable.cat3, Color.parseColor("#3395ff")))
        addSlide(AppIntroFragment.newInstance("Travel", "Book the tickets of bus, trains and airlines from here!", R.drawable.cat4, Color.parseColor("#c873f4")))
        // setFadeAnimation();
        setDepthAnimation()
        //        setFadeAnimation();
        //        setZoomAnimation();
        //        setFlowAnimation();
        //        setSlideOverAnimation();
    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        // Do something when users tap on Skip button.
        Toast.makeText(this, "You Pressed Skip!", Toast.LENGTH_SHORT).show()
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        // Do something when users tap on Done button.
        Toast.makeText(this, "You Pressed Done!!", Toast.LENGTH_SHORT).show()
    }

    override fun onSlideChanged(oldFragment: Fragment?, newFragment: Fragment?) {
        super.onSlideChanged(oldFragment, newFragment)
        // Do something when the slide changes.

    }

}