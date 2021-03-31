package `in`.aayushgoyal.popcorntimes

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import androidx.recyclerview.widget.RecyclerView

import com.bumptech.glide.Glide

class TitlesHomeFragmentAdapter(private val context: Context, private val titlesList: List<Int>) : RecyclerView.Adapter<TitlesHomeFragmentAdapter.TitleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TitleViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.list_item_title_fragment_home, parent, false)
        return TitleViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: TitleViewHolder, position: Int) {
        val posterURL = titlesList[position]

        Glide.with(context).load(posterURL).into(viewHolder.ivTitlePoster)
    }

    override fun getItemCount() = titlesList.size

    inner class TitleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivTitlePoster = itemView.findViewById<ImageView>(R.id.iv_title_poster_list_item_movie_tv_show_fragment_home)
    }

}