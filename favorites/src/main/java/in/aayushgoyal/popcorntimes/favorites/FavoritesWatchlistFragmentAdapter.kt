package `in`.aayushgoyal.popcorntimes.favorites

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

import `in`.aayushgoyal.popcorntimes.favorites.FavoritesFragment
import `in`.aayushgoyal.popcorntimes.favorites.WatchlistFragment

class FavoritesWatchlistFragmentAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return if (position == 0)
            FavoritesFragment()
        else
            WatchlistFragment()
    }
}