package `in`.aayushgoyal.popcorntimes

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

import `in`.aayushgoyal.popcorntimes.ui.home.MoviesFragment
import `in`.aayushgoyal.popcorntimes.ui.home.TVShowsFragment

class MovieTVShowFragmentAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        //        fragment.arguments = Bundle().apply {
//            if (position == 0)
//                putString("name", "movies")
//            else
//                putString("name", "tv shows")
//        }

        return if (position == 0)
            MoviesFragment()
        else
            TVShowsFragment()
    }

}