package com.platzi.platzistore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_descr.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

         intent?.extras?.let {
             val title = it.getString("title")
             val descr = it.getString("desc")
             val price = it.getDouble("price")

             txtDetailTitulo.text = title
             txtDetailDesc.text = descr
             txtDetailPrice.text = "$ ${String.format("%.2f", price)}"


        }


    }
}
