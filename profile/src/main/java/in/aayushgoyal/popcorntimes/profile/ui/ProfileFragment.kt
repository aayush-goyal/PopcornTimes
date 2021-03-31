package `in`.aayushgoyal.popcorntimes.profile.ui

import `in`.aayushgoyal.popcorntimes.profile.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

/**
 * This class serves as a ViewModel for AddEditAccountActivity.
 *
 * @version 0.1.0
 * @author Aayush Goyal
 * @created 2020-03-14
 * @modifier
 * @modified
 * @since 0.70.0
 */
class ProfileFragment : Fragment() {

    private val profileViewModel: ProfileFragment by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_profile, container, false)

        return root
    }

}
