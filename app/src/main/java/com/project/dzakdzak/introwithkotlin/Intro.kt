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
        addSlide(AppIntroFragment.newInstance("Hello Cat!", "Cat Is Very Cute!", R.drawable.cat1, Color.parseColor("#f64c73")))
        addSlide(AppIntroFragment.newInstance("Great Cat!", "Great Cat! Yeayyy!", R.drawable.cat2, Color.parseColor("#20d2bb")))
        addSlide(AppIntroFragment.newInstance("Cat Movie!", "The Movie Is Cool!", R.drawable.cat3, Color.parseColor("#3395ff")))
        addSlide(AppIntroFragment.newInstance("Traveling Cat", "Yeayyyyyyyy!", R.drawable.cat4, Color.parseColor("#c873f4")))
        // setFadeAnimation();
        setDepthAnimation()
        //        setFadeAnimation();
        //        setZoomAnimation();
        //        setFlowAnimation();
        //        setSlideOverAnimation();
    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        // Jika User Klik Skip
        Toast.makeText(this, "You Pressed Skip!", Toast.LENGTH_SHORT).show()
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        // Jika User Klik Done
        Toast.makeText(this, "You Pressed Done!!", Toast.LENGTH_SHORT).show()
    }

    override fun onSlideChanged(oldFragment: Fragment?, newFragment: Fragment?) {
        super.onSlideChanged(oldFragment, newFragment)
        // Jika Slide Berganti

    }

}