package com.example.mvvmretrolivedata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmretrolivedata.model.Memes

class MemeAdapter(private val items: Memes) : RecyclerView.Adapter<MemeAdapter.MemeAdapterClass>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemeAdapter.MemeAdapterClass {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_rv_item, parent, false)

        return MemeAdapterClass(view)
    }

    override fun onBindViewHolder(holder: MemeAdapter.MemeAdapterClass, position: Int) {
        //val item = items[position]
        //holder.title.text = item.names
    }

    override fun getItemCount(): Int {
        return 4
        //items.size
    }

    class MemeAdapterClass(item : View): RecyclerView.ViewHolder(item){
        val title: TextView = item.findViewById(R.id.movieTitle)
    }

    //new code

    /*var movies = mutableListOf<Movie>()

    fun setMovieList(movies: List<Movie>) {
        this.movies = movies.toMutableList()
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = LayoutRvItemBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }
    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val movie = movies[position]
        holder.binding.movieTitle.text = movie.title
        Glide.with(holder.itemView.context).load(movie.poster).placeholder(R.drawable.placeholder)
            .into(holder.binding.moviePoster)

    }
    override fun getItemCount(): Int {
        return movies.size
    }
}
class MainViewHolder(val binding: LayoutRvItemBinding) : RecyclerView.ViewHolder(binding.root) {}
*/
}


