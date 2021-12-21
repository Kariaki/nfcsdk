package com.data.recyclerview_helper

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.kcoding.recyclerview_helper.SuperEntity

abstract class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
     
     abstract fun  bindPostType(types: SuperEntity, context:Context, clickListener: SuperClickListener)

}