package com.example.lekcjapoprzerwie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x = 0;
        findViewById<Button>(R.id.button).setOnClickListener {
            if(x<4){
                x+=1;
                if(x==1)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.jeden)
                }
                if(x==2)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.dwa)
                }
                if(x==3)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.trzy)
                }
                if(x==4)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.cztery)
                }
            }
            else{
                x=4;
            }
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            if(x != 0){
                x-=1;
                if(x==1)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.jeden)
                }
                if(x==2)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.dwa)
                }
                if(x==3)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.trzy)
                }
                if(x==4)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.cztery)
                }
            }
            else{
                x=0;
            }
        }


    }}