package com.example.lagani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun Afterclick(view: View) {

            var year1= findViewById<EditText>(R.id.year1)
            var month1= findViewById<EditText>(R.id.month1)
            var day1= findViewById<EditText>(R.id.day1)

            var year2= findViewById<EditText>(R.id.year2)
            var month2= findViewById<EditText>(R.id.month2)
            var day2= findViewById<EditText>(R.id.day2)


            var yrs=year1.editableText.toString()
            var y=Integer. parseInt(yrs);
            var mnth=month1.editableText.toString()
            var m=Integer. parseInt(mnth)
            var dy=day1.editableText.toString()
            var d=Integer. parseInt(dy)

            var yrs2=year2.editableText.toString()
            var y1=Integer. parseInt(yrs2)
            var mnth2=month2.editableText.toString()
            var m1=Integer. parseInt(mnth2)
            var dy2=day2.editableText.toString()
            var d1=Integer. parseInt(dy2)

            var amount1= findViewById<EditText>(R.id.amount1)
            var rate1= findViewById<EditText>(R.id.rate1)

            var am= amount1.editableText.toString()

var amt:Double=am.toDouble()
            var ra= rate1.editableText.toString()

            var rat:Double=ra.toDouble()

            var tm:Int
            var td:Int
            var ty:Int
            var total:Double
            var ci:Double
            var cmonth:Double
            var cday:Double



            if(d1>=d){
                td=d1-d
            }
            else{
                td=(d1+30)-d
                m1--

            }

        if(m1>=m){

            tm=m1-m
        }
        else{
            tm=((m1+12)-m)
            y1--

        }

        if (y1>=y ){
            ty=y1-y
        }
        else{
            ty=0

        }



        if(tm==0){
            ci = amt * (Math.pow((1 + rat * 12 / 100), ty.toDouble()))
            cday=(ci*rat*td)/ (100*30)
            total = ci+cday

            val textView=findViewById<TextView>(R.id.textView)

            textView.setText("   कुल रकम:" + total + "  कुल बर्ष :" + ty + " कुल महिना:" + tm + " कुल दिन:" + td)


        }


        else
    {
        ci = amt * (Math.pow((1 + rat * 12 / 100), ty.toDouble()))
        cmonth = (ci * tm * rat) / 100.toDouble()
        cday = (cmonth * td) / (tm * 30).toDouble()
        total = ci + cmonth + cday

        val textView=findViewById<TextView>(R.id.textView)
        textView.setText("   कुल रकम:" + total + "  कुल बर्ष :" + ty + " कुल महिना:" + tm + " कुल दिन:" + td)


    }

        



    }


}