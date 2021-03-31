package `in`.aayushgoyal.popcorntimes.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

import `in`.aayushgoyal.popcorntimes.MovieTVShowFragmentAdapter
import `in`.aayushgoyal.popcorntimes.R

class HomeFragment : Fragment() {

    private lateinit var viewPager: ViewPager2

    private lateinit var movieTVShowFragmentAdapter: MovieTVShowFragmentAdapter

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        movieTVShowFragmentAdapter = MovieTVShowFragmentAdapter(this)
        viewPager = view.findViewById(R.id.viewpager_fragment_home)
        viewPager.adapter = movieTVShowFragmentAdapter

        val tabLayout = view.findViewById<TabLayout>(R.id.layout_tab_fragment_home)
        TabLayoutMediator(tabLayout, viewPager) {tab, position ->
            if (position == 0)
                tab.text = "movies"
            else
                tab.text = "tv shows"
        }.attach()
    }
}
