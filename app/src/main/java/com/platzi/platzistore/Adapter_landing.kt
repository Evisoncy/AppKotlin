package com.platzi.platzistore

import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_landing.view.*
import java.net.URI.create

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

               // Glide.with(itemView.context).load(urlImage).into(itemView.imgItemHeader)

                itemView.setOnClickListener{
                    val intent = Intent(itemView.context,DetailActivity::class.java)
                    intent.putExtra("title", title)
                    intent.putExtra("desc", desc)
                    intent.putExtra("price", price)

                    val p1:Pair<View, String> = Pair.create(itemView.imgItemHeader,"transitionHeader")
                    val p2:Pair<View, String> = Pair.create(itemView.txtTitleItem,"transitionTitle")
                    val p3:Pair<View, String> = Pair.create(itemView.txtDescItem, "transitionDesc")
                    val p4:Pair<View, String> = Pair.create(itemView.txtPriceItem, "transitionPrice")
                    val options= ActivityOptionsCompat.makeSceneTransitionAnimation(itemView.context as Activity,p2,p3,p4)
                    itemView.context.startActivity(intent, options.toBundle())

                }
            }

        }
    }

}