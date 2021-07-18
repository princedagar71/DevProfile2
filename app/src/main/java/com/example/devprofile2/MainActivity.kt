package com.example.devprofile2

import android.graphics.BitmapFactory
import android.media.tv.TvContract
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import com.example.devprofile2.R.id.Logo
import kotlinx.android.synthetic.main.activity_main.*

//import com.example.devprofile2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    //private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        //Logo=findViewById(R.id.Logo)
        val bitmap=BitmapFactory.decodeResource(resources,R.drawable.devslopesprofilelogo)
        val rounded =RoundedBitmapDrawableFactory.create(resources,bitmap)
        rounded.cornerRadius=15f
        //rounded.isCircular=true

        Logo.setImageDrawable(rounded)



    }
}