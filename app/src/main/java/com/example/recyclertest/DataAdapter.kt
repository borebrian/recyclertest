package com.example.recyclertest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_view_item.view.*

class DataAdapter(val context:Context,val hobby: List<Hobby>):RecyclerView.Adapter<DataAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
val view=LayoutInflater.from(context).inflate(R.layout.list_view_item,parent,false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        return hobby.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
    val hobby=hobby[position]
        holder.setData(hobby,position)

    }


    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
fun setData(hobby:Hobby?,pos:Int){
    itemView.txtTitle.text=hobby!!.title
}
}


}