package com.platzi.platzistore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import com.platzi.platzistore.DetailActivity as DetailActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtView.text="Hola Android Extentions"

      //  toastShort("Mensaje Toast corto")
        toast("Mensaje toascorto dsde Anko")

        txtView.setOnClickListener {
            startActivity<DetailActivity>("text" to "Hola desde Anko")
        }
    }
}
