package `in`.aayushgoyal.popcorntimes.favorites

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

import `in`.aayushgoyal.popcorntimes.R as appR

class FavoritesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_favorites, container, false)

        val recyclerViewTitlesFavoritesFragment = view.findViewById<RecyclerView>(R.id.view_recycler_titles_fragment_favorites)
        val gridLayoutManager = GridLayoutManager(activity, 3)
        recyclerViewTitlesFavoritesFragment.layoutManager = gridLayoutManager

        val titlesList = listOf(
            mapOf("posterURL" to appR.drawable.test_image, "name" to "Saving Private Ryan", "rating" to "8.3", "icon" to appR.drawable.ic_movie, "year" to "2016"),
            mapOf("posterURL" to appR.drawable.test_image, "name" to "Saving Private Ryan", "rating" to "8.3", "icon" to appR.drawable.ic_movie, "year" to "2016"),
            mapOf("posterURL" to appR.drawable.test_image, "name" to "Saving Private Ryan", "rating" to "8.3", "icon" to appR.drawable.ic_movie, "year" to "2016"),
            mapOf("posterURL" to appR.drawable.test_image, "name" to "Saving Private Ryan", "rating" to "8.3", "icon" to appR.drawable.ic_movie, "year" to "2016"),
            mapOf("posterURL" to appR.drawable.test_image, "name" to "Saving Private Ryan", "rating" to "8.3", "icon" to appR.drawable.ic_movie, "year" to "2016"),
            mapOf("posterURL" to appR.drawable.test_image, "name" to "Saving Private Ryan", "rating" to "8.3", "icon" to appR.drawable.ic_movie, "year" to "2016"),
            mapOf("posterURL" to appR.drawable.test_image, "name" to "Saving Private Ryan", "rating" to "8.3", "icon" to appR.drawable.ic_movie, "year" to "2016"),
            mapOf("posterURL" to appR.drawable.test_image, "name" to "Saving Private Ryan", "rating" to "8.3", "icon" to appR.drawable.ic_movie, "year" to "2016"),
            mapOf("posterURL" to appR.drawable.test_image, "name" to "Saving Private Ryan", "rating" to "8.3", "icon" to appR.drawable.ic_movie, "year" to "2016")
        )
        val titlesAdapter = TitlesBookmarksFragment(requireContext(), titlesList)
        recyclerViewTitlesFavoritesFragment.adapter = titlesAdapter

        return view
    }

}
