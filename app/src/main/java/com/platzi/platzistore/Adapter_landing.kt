package com.platzi.platzistore

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_landing.view.*

class Adapter_landing(val data:List<ItemLanding>):RecyclerView.Adapter<Adapter_landing.holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): holder =
        holder(parent?.inflate(R.layout.item_landing))


    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: holder, position: Int) {
       holder?.bindView(data[position])
    }

    class holder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindView(itemLanding: ItemLanding){
            with(itemLanding){
                itemView.txtTitleItem.text=title
                itemView.txtDescItem.text=desc
                itemView.txtPriceItem.text=" $ ${String.format("%.2f", price)}"
            }

        }
    }

}