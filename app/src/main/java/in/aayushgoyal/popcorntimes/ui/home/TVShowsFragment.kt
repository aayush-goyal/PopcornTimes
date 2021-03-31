package `in`.aayushgoyal.popcorntimes.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import `in`.aayushgoyal.popcorntimes.Genre
import `in`.aayushgoyal.popcorntimes.ui.GenresAdapter
import `in`.aayushgoyal.popcorntimes.R
import `in`.aayushgoyal.popcorntimes.TitlesHomeFragmentAdapter

class TVShowsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_tv_shows, container, false)

        val recentlyViewedTVShowTitlesRecyclerView = view.findViewById<RecyclerView>(R.id.view_recycler_recently_viewed_fragment_tv_shows)
        recentlyViewedTVShowTitlesRecyclerView.hasFixedSize()
        recentlyViewedTVShowTitlesRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val topRatedTVShowTitlesRecyclerView = view.findViewById<RecyclerView>(R.id.view_recycler_top_rated_fragment_tv_shows)
        topRatedTVShowTitlesRecyclerView.hasFixedSize()
        topRatedTVShowTitlesRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val mostViewedTVShowTitlesRecyclerView = view.findViewById<RecyclerView>(R.id.view_recycler_most_viewed_fragment_tv_shows)
        mostViewedTVShowTitlesRecyclerView.hasFixedSize()
        mostViewedTVShowTitlesRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val mostPopularTVShowTitlesRecyclerView = view.findViewById<RecyclerView>(R.id.view_recycler_most_popular_fragment_tv_shows)
        mostPopularTVShowTitlesRecyclerView.hasFixedSize()
        mostPopularTVShowTitlesRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val genresRecyclerView = view.findViewById<RecyclerView>(R.id.view_recycler_genres_fragment_tv_shows)
        genresRecyclerView.hasFixedSize()
        genresRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val recentlyViewedTVShowTitlesList = listOf(
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image)
        val recentlyViewedTVShowTitlesAdapter = TitlesHomeFragmentAdapter(context!!, recentlyViewedTVShowTitlesList)
        recentlyViewedTVShowTitlesRecyclerView.adapter = recentlyViewedTVShowTitlesAdapter

        val topRatedTVShowTitlesList = listOf(
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image)
        val topRatedTVShowTitlesAdapter = TitlesHomeFragmentAdapter(context!!, topRatedTVShowTitlesList)
        topRatedTVShowTitlesRecyclerView.adapter = topRatedTVShowTitlesAdapter

        val mostViewedTVShowTitlesList = listOf(
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image)
        val mostViewedTVShowTitlesAdapter = TitlesHomeFragmentAdapter(context!!, mostViewedTVShowTitlesList)
        mostViewedTVShowTitlesRecyclerView.adapter = mostViewedTVShowTitlesAdapter

        val mostPopularTVShowTitlesList = listOf(
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image)
        val mostPopularTVShowTitlesAdapter = TitlesHomeFragmentAdapter(context!!, mostPopularTVShowTitlesList)
        mostPopularTVShowTitlesRecyclerView.adapter = mostPopularTVShowTitlesAdapter

        val genresList = listOf(
            Genre(R.drawable.ic_genre_action, "action & adventure"),
            Genre(R.drawable.ic_genre_animation, "animation"),
            Genre(R.drawable.ic_genre_comedy, "comedy"),
            Genre(R.drawable.ic_genre_crime, "crime"),
            Genre(R.drawable.ic_genre_documentary, "documentary"),
            Genre(R.drawable.ic_genre_drama, "drama"),
            Genre(R.drawable.ic_genre_family, "family"),
            Genre(R.drawable.ic_genre_fantasy, "kids"),
            Genre(R.drawable.ic_genre_mystery, "mystery"),
            Genre(R.drawable.ic_genre_history, "news"),
            Genre(R.drawable.ic_genre_romance, "reality"),
            Genre(R.drawable.ic_genre_science_fiction, "sci-fi & fantasy"),
            Genre(R.drawable.ic_genre_tv_movie, "soap"),
            Genre(R.drawable.ic_genre_thriller, "talk"),
            Genre(R.drawable.ic_genre_war, "war & politics"),
            Genre(R.drawable.ic_genre_western, "western")
        )
        val genresAdapter = GenresAdapter(context!!, genresList)
        genresRecyclerView.adapter = genresAdapter

        return view
    }

}
