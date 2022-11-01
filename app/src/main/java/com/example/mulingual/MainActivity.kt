package com.example.mulingual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tx1: TextView =findViewById(R.id.textView1)
        val tx2: TextView =findViewById(R.id.textView2)
        val tx3: TextView =findViewById(R.id.textView3)
        val tx4: TextView =findViewById(R.id.textView4)
        val tx5: TextView =findViewById(R.id.textView5)
        val tx6: TextView =findViewById(R.id.textView6)
        var Edtxt: EditText=findViewById(R.id.edtext1)

        var flag1 : String = "English"
        var flag2 : String = "Brain Training"
        val spin1 : Spinner = findViewById(R.id.spinner1)
        val options = arrayOf("English","Turkish","Spanish","Arabic","Urdu","Italian","German")
        spin1.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        spin1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag1 = options.get(p2) //p2 is the index of selected item
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        val spin2 : Spinner = findViewById(R.id.spinner2)
        val option = arrayOf("Brain Training","Job opportunities","Culture","School","Travel")
        spin2.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,option)

        spin2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag2 = options.get(p2) //p2 is the index of selected item
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }



    }
}