package com.jongmin.swipebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ebanx.swipebtn.SwipeButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var swipebutton:SwipeButton = findViewById(R.id.SwipeButton_button)
        swipebutton.setOnStateChangeListener{

            //실행할때 마다 표시
            Toast.makeText(this,"Active  " + it,Toast.LENGTH_SHORT).show()

        }
    }
}
