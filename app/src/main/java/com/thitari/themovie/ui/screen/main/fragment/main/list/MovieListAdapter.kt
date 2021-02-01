package com.thitari.themovie.ui.screen.main.fragment.main.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.thitari.themovie.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_movie.*

class MovieListAdapter(private val movieCallback: (movie: MovieUiModel) -> Unit) :
    RecyclerView.Adapter<MovieListAdapter.MovieViewHolder>() {

    var movieUiModels: List<MovieUiModel> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    private lateinit var recyclerView: RecyclerView

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        this.recyclerView = recyclerView
        val dividerItemDecoration =
            DividerItemDecoration(recyclerView.context, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(dividerItemDecoration)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        @LayoutRes viewType: Int
    ): MovieViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(itemView)
    }

    override fun getItemCount(): Int = movieUiModels.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindUiModel(movieUiModels[position])
    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        LayoutContainer {

        lateinit var uiModel: MovieUiModel

        init {
            itemView.setOnClickListener {
                movieCallback.invoke(uiModel)
            }
        }

        fun bindUiModel(uiModel: MovieUiModel) {
            this.uiModel = uiModel
            with(uiModel) {
                ivItemMovie.load(imageUrl)
                tvItemMovieTitle.text = title
                tvItemMovieRating.text = rating.toString()
                tvItemMovieReleaseDate.text = releaseDate
            }
        }

        override val containerView: View?
            get() = itemView
    }
}
