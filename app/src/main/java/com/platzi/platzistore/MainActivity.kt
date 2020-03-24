package com.platzi.platzistore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import com.platzi.platzistore.DetailActivity as DetailActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcViewLanding.layoutManager=GridLayoutManager(this, 2)

        val itemsShop =(0..20).map {
          ItemLanding("titulo $it", "Descr $it",200.00+it)
        }

        val adapter =Adapter_landing(itemsShop)
        rcViewLanding.adapter=adapter

    }
}
