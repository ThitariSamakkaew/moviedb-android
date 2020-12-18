package com.thitari.themovie.ui.screen.main.fragment.listmovie.popular

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thitari.themovie.R

class PopularAdapter: RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PopularViewHolder {
      val itemView = LayoutInflater.from(parent.context).inflate(viewType,parent,false)
        return when (viewType){
            R.layout.
        }
    }

    override fun onBindViewHolder(holder: PopularAdapter.PopularViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
