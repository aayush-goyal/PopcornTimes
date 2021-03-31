package `in`.aayushgoyal.popcorntimes.ui

import `in`.aayushgoyal.popcorntimes.Genre
import `in`.aayushgoyal.popcorntimes.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class GenresAdapter(private val context: Context, private val genresList: List<Genre>) : RecyclerView.Adapter<GenresAdapter.GenreViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenreViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.list_item_genre_fragment_home, parent, false)
        return GenreViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: GenreViewHolder, position: Int) {
        val genre = genresList[position]

        viewHolder.genreIcon.setImageResource(genre.icon)
        viewHolder.genreName.text = genre.name
    }

    override fun getItemCount() = genresList.size

    inner class GenreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val genreIcon = itemView.findViewById<ImageButton>(R.id.iv_genre_icon_list_item_genre_fragment_home)
        val genreName = itemView.findViewById<TextView>(R.id.tv_genre_name_list_item_genre_fragment_home)
    }
}