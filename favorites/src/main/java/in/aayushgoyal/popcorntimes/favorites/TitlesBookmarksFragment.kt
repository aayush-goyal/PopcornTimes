package `in`.aayushgoyal.popcorntimes.favorites

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

import com.bumptech.glide.Glide

class TitlesBookmarksFragment(private val context: Context, private val titlesList: List<Map<String, Any>>) : RecyclerView.Adapter<TitlesBookmarksFragment.TitleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TitleViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.list_item_title_fragment_bookmarks, parent, false)
        return TitleViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: TitleViewHolder, position: Int) {
        val title = titlesList[position]

        Glide.with(context).load(title["posterURL"] as Int).into(viewHolder.ivTitlePoster)
        viewHolder.tvName.text = title["name"] as String
        viewHolder.tvRating.text = title["rating"] as String
        Glide.with(context).load(title["icon"] as Int).into(viewHolder.ivIcon)
        viewHolder.tvYear.text = title["year"] as String
    }

    override fun getItemCount() = titlesList.size

    inner class TitleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivTitlePoster = itemView.findViewById<ImageView>(R.id.iv_title_poster_list_item_title_fragment_bookmarks)
        val tvName = itemView.findViewById<TextView>(R.id.tv_title_name_list_item_title_fragment_bookmarks)
        val tvRating = itemView.findViewById<TextView>(R.id.tv_rating_list_item_title_fragment_bookmarks)
        val ivIcon = itemView.findViewById<ImageView>(R.id.iv_icon_list_item_title_fragment_bookmarks)
        val tvYear = itemView.findViewById<TextView>(R.id.tv_year_list_item_title_fragment_bookmarks)
    }


}