package `in`.aayushgoyal.popcorntimes.profile.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

import `in`.aayushgoyal.popcorntimes.profile.R
import `in`.aayushgoyal.popcorntimes.profile.model.TopContributor

class TopContributorsAdapter(private val context: Context, private val topContributorsList: List<TopContributor>) : RecyclerView.Adapter<TopContributorsAdapter.TopContributorViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopContributorViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.list_item_profile_credit_top_contributor, parent, false)
        view.findViewById<TextView>(R.id.tv_contribution_type_list_item_profiles_credits_top_contributors).visibility = View.GONE
        view.findViewById<ImageView>(R.id.iv_github_list_item_profiles_credits_top_contributors).visibility = View.GONE
        return TopContributorViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: TopContributorViewHolder, position: Int) {
        val topContributor = topContributorsList[position]
    }

    override fun getItemCount() = topContributorsList.size

    inner class TopContributorViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val ivUserProfilePicture = itemView.findViewById<ImageView>(R.id.iv_user_profile_picture_list_item_profiles_credits_top_contributors)
        val tvUserFullName = itemView.findViewById<TextView>(R.id.tv_user_full_name_list_item_profiles_credits_top_contributors)
        val tvContributionAmount = itemView.findViewById<TextView>(R.id.tv_contribution_amount_list_item_profiles_credits_top_contributors)
        val ivEmail = itemView.findViewById<ImageView>(R.id.iv_email_list_item_profiles_credits_top_contributors)
        val ivFacebook = itemView.findViewById<ImageView>(R.id.iv_facebook_list_item_profiles_credits_top_contributors)
        val ivTwitter = itemView.findViewById<ImageView>(R.id.iv_twitter_list_item_profiles_credits_top_contributors)
        val ivInstagram = itemView.findViewById<ImageView>(R.id.iv_instagram_list_item_profiles_credits_top_contributors)
    }
}

// Code to use ViewBinding in Adapter.

//class HoursAdapter(private val hoursList: List<HoursItem>)
//    :RecyclerView.Adapter<HoursAdapter.HoursViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoursViewHolder {
//        val binding = HoursListItemsBinding
//            .inflate(LayoutInflater.from(parent.context), parent, false)
//        return HoursViewHolder(binding)
//    }
//
//    override fun getItemCount() = hoursList.size
//
//    override fun onBindViewHolder(holder: HoursViewHolder, position: Int) {
//        with(holder){
//            with(hoursList[position]) {
//                binding.topLearnerName.text = name
//                val hours = "$hours learning hours, $country"
//                binding.topLearnerTime.text = hours
//                GlideApp.with(holder.itemView.context)
//                    .load(badgeUrl)
//                    .into(binding.topLearnerImage)
//
//                holder.itemView.setOnClickListener {
//                    Toast.makeText(holder.itemView.context, hours,
//                        Toast.LENGTH_SHORT).show()
//                }
//            }
//        }
//    }
//
//    inner class HoursViewHolder(val binding: HoursListItemsBinding)
//        :RecyclerView.ViewHolder(binding.root)
//
//}