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

class MoviesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_movies, container, false)

        val recentlyViewedMovieTitlesRecyclerView = view.findViewById<RecyclerView>(R.id.view_recycler_recently_viewed_fragment_movies)
        recentlyViewedMovieTitlesRecyclerView.hasFixedSize()
        recentlyViewedMovieTitlesRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val topRatedMovieTitlesRecyclerView = view.findViewById<RecyclerView>(R.id.view_recycler_top_rated_fragment_movies)
        topRatedMovieTitlesRecyclerView.hasFixedSize()
        topRatedMovieTitlesRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val mostViewedMovieTitlesRecyclerView = view.findViewById<RecyclerView>(R.id.view_recycler_most_viewed_fragment_movies)
        mostViewedMovieTitlesRecyclerView.hasFixedSize()
        mostViewedMovieTitlesRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val mostPopularMovieTitlesRecyclerView = view.findViewById<RecyclerView>(R.id.view_recycler_most_popular_fragment_movies)
        mostPopularMovieTitlesRecyclerView.hasFixedSize()
        mostPopularMovieTitlesRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val genresRecyclerView = view.findViewById<RecyclerView>(R.id.view_recycler_genres_fragment_movies)
        genresRecyclerView.hasFixedSize()
        genresRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val recentlyViewedMovieTitlesList = listOf(
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image)
        val recentlyViewedMovieTitlesAdapter = TitlesHomeFragmentAdapter(context!!, recentlyViewedMovieTitlesList)
        recentlyViewedMovieTitlesRecyclerView.adapter = recentlyViewedMovieTitlesAdapter

        val topRatedMovieTitlesList = listOf(
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image)
        val topRatedMovieTitlesAdapter = TitlesHomeFragmentAdapter(context!!, topRatedMovieTitlesList)
        topRatedMovieTitlesRecyclerView.adapter = topRatedMovieTitlesAdapter

        val mostViewedMovieTitlesList = listOf(
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image)
        val mostViewedMovieTitlesAdapter = TitlesHomeFragmentAdapter(context!!, mostViewedMovieTitlesList)
        mostViewedMovieTitlesRecyclerView.adapter = mostViewedMovieTitlesAdapter

        val mostPopularMovieTitlesList = listOf(
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image,
            R.drawable.test_image)
        val mostPopularMovieTitlesAdapter = TitlesHomeFragmentAdapter(context!!, mostPopularMovieTitlesList)
        mostPopularMovieTitlesRecyclerView.adapter = mostPopularMovieTitlesAdapter

        val genresList = listOf(
            Genre(R.drawable.ic_genre_action, "action"),
            Genre(R.drawable.ic_genre_adventure, "adventure"),
            Genre(R.drawable.ic_genre_animation, "animation"),
            Genre(R.drawable.ic_genre_comedy, "comedy"),
            Genre(R.drawable.ic_genre_crime, "crime"),
            Genre(R.drawable.ic_genre_documentary, "documentary"),
            Genre(R.drawable.ic_genre_drama, "drama"),
            Genre(R.drawable.ic_genre_family, "family"),
            Genre(R.drawable.ic_genre_fantasy, "fantasy"),
            Genre(R.drawable.ic_genre_history, "history"),
            Genre(R.drawable.ic_genre_horror, "horror"),
            Genre(R.drawable.ic_genre_music, "music"),
            Genre(R.drawable.ic_genre_mystery, "mystery"),
            Genre(R.drawable.ic_genre_romance, "romance"),
            Genre(R.drawable.ic_genre_science_fiction, "science fiction"),
            Genre(R.drawable.ic_genre_tv_movie, "tv movie"),
            Genre(R.drawable.ic_genre_thriller, "thriller"),
            Genre(R.drawable.ic_genre_war, "war"),
            Genre(R.drawable.ic_genre_western, "western"))
        val genresAdapter = GenresAdapter(context!!, genresList)
        genresRecyclerView.adapter = genresAdapter

        return view

    }

    /* override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    } */

}
