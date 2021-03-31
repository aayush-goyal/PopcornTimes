package `in`.aayushgoyal.popcorntimes.favorites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment

import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class BookmarksFragment : Fragment() {

    private lateinit var viewPager: ViewPager2

    private lateinit var favoritesWatchlistFragmentAdapter: FavoritesWatchlistFragmentAdapter

    private lateinit var bookmarksViewModel: BookmarksViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_bookmarks, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        favoritesWatchlistFragmentAdapter = FavoritesWatchlistFragmentAdapter(this)
        viewPager = view.findViewById(R.id.viewpager_fragment_bookmarks)
        viewPager.adapter = favoritesWatchlistFragmentAdapter

        val tabLayout = view.findViewById<TabLayout>(R.id.layout_tab_fragment_bookmarks)
        TabLayoutMediator(tabLayout, viewPager) {tab, position ->
            if (position == 0)
                tab.text = "favorites"
            else
                tab.text = "watchlist"
        }.attach()
    }
}
