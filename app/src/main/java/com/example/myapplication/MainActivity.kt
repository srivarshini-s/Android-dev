package com.example.myapplication

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.myapplication.PaintView.Companion.colorList
import com.example.myapplication.PaintView.Companion.currentBrush
import com.example.myapplication.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path=Path()
        var paintBrush=Paint()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val blackBtn = findViewById<ImageButton>(R.id.blackColor)
        val greenBtn = findViewById<ImageButton>(R.id.greenColor)
        val eraser = findViewById<ImageButton>(R.id.whiteColor)
        val pinkBtn = findViewById<ImageButton>(R.id.pinkColor)
        val blueBtn = findViewById<ImageButton>(R.id.blueColor)

        redBtn.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color= Color.RED
            currentColor(paintBrush.color)


        }

        blackBtn.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color= Color.BLACK
            currentColor(paintBrush.color)

        }

        greenBtn.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color= Color.GREEN
            currentColor(paintBrush.color)

        }

        pinkBtn.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color= Color.MAGENTA
            currentColor(paintBrush.color)

        }

        blueBtn.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color= Color.BLUE
            currentColor(paintBrush.color)

        }

        eraser.setOnClickListener{
            
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }

    }

    private fun currentColor(color:Int){
        currentBrush=color
        path=Path()
    }
}