package com.example.my_app_2

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val nameField: TextView = findViewById(R.id.textView)
        val ageField: TextView = findViewById(R.id.textView2)
        val specField: TextView = findViewById(R.id.textView3)

        nameField.setText(nameField.text.toString() + " Ruslan Ishmaev")
        ageField.setText(ageField.text.toString() + " 21")
        specField.setText(specField.text.toString() + " NEET")

        val photoTab: TextView = findViewById(R.id.textView5)
        val projectTab: TextView = findViewById(R.id.textView6)
        val achievementTab: TextView = findViewById(R.id.textView7)
        val otherTab: TextView = findViewById(R.id.textView8)

        photoTab.setOnClickListener(this)
        projectTab.setOnClickListener(this)
        achievementTab.setOnClickListener(this)
        otherTab.setOnClickListener(this)

        photoTab.performClick()



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onClick(view: View?) {
        when (view?.id){
            R.id.textView5 -> {
                val photoTab: TextView = findViewById(R.id.textView5)
                val projectTab: TextView = findViewById(R.id.textView6)
                val achievementTab: TextView = findViewById(R.id.textView7)
                val otherTab: TextView = findViewById(R.id.textView8)
                projectTab.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.white))
                achievementTab.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.white))
                otherTab.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.white))

                photoTab.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.colorAccent))

                val image1: ImageView = findViewById(R.id.imageView3)
                val image2: ImageView = findViewById(R.id.imageView4)
                val image3: ImageView = findViewById(R.id.imageView5)
                val image4: ImageView = findViewById(R.id.imageView6)
                val image5: ImageView = findViewById(R.id.imageView7)
                val image6: ImageView = findViewById(R.id.imageView8)

                image1.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.photos_1))
                image2.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.photos_2))
                image3.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.photos_3))
                image4.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.photos_4))
                image5.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.photos_5))
                image6.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.photos_6))

            }
            R.id.textView6 -> {
                val photoTab: TextView = findViewById(R.id.textView5)
                val projectTab: TextView = findViewById(R.id.textView6)
                val achievementTab: TextView = findViewById(R.id.textView7)
                val otherTab: TextView = findViewById(R.id.textView8)
                photoTab.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.white))
                achievementTab.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.white))
                otherTab.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.white))

                projectTab.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.colorAccent))

                val image1: ImageView = findViewById(R.id.imageView3)
                val image2: ImageView = findViewById(R.id.imageView4)
                val image3: ImageView = findViewById(R.id.imageView5)
                val image4: ImageView = findViewById(R.id.imageView6)
                val image5: ImageView = findViewById(R.id.imageView7)
                val image6: ImageView = findViewById(R.id.imageView8)

                image1.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.proj_1))
                image2.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.proj_2))
                image3.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.proj_3))
                image4.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.proj_4))
                image5.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.proj_5))
                image6.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.proj_6))
            }

            R.id.textView7 -> {
                val photoTab: TextView = findViewById(R.id.textView5)
                val projectTab: TextView = findViewById(R.id.textView6)
                val achievementTab: TextView = findViewById(R.id.textView7)
                val otherTab: TextView = findViewById(R.id.textView8)
                projectTab.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.white))
                photoTab.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.white))
                otherTab.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.white))

                achievementTab.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.colorAccent))

                val image1: ImageView = findViewById(R.id.imageView3)
                val image2: ImageView = findViewById(R.id.imageView4)
                val image3: ImageView = findViewById(R.id.imageView5)
                val image4: ImageView = findViewById(R.id.imageView6)
                val image5: ImageView = findViewById(R.id.imageView7)
                val image6: ImageView = findViewById(R.id.imageView8)

                image1.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.ach_1))
                image2.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.ach_2))
                image3.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.ach_3))
                image4.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.ach_4))
                image5.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.ach_5))
                image6.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.ach_6))
            }

            R.id.textView8 -> {
                val photoTab: TextView = findViewById(R.id.textView5)
                val projectTab: TextView = findViewById(R.id.textView6)
                val achievementTab: TextView = findViewById(R.id.textView7)
                val otherTab: TextView = findViewById(R.id.textView8)
                projectTab.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.white))
                achievementTab.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.white))
                photoTab.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.white))

                otherTab.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.colorAccent))

                val image1: ImageView = findViewById(R.id.imageView3)
                val image2: ImageView = findViewById(R.id.imageView4)
                val image3: ImageView = findViewById(R.id.imageView5)
                val image4: ImageView = findViewById(R.id.imageView6)
                val image5: ImageView = findViewById(R.id.imageView7)
                val image6: ImageView = findViewById(R.id.imageView8)

                image1.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.oth_1))
                image2.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.oth_2))
                image3.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.oth_3))
                image4.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.oth_4))
                image5.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.oth_5))
                image6.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.oth_6))
            }
        }
    }


}