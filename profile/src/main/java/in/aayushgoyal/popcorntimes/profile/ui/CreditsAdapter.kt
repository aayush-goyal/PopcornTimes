package `in`.aayushgoyal.popcorntimes.profile.ui

import `in`.aayushgoyal.popcorntimes.profile.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class CreditsAdapter(private val context: Context, private val creditsList: List<`in`.aayushgoyal.popcorntimes.profile.model.Credit>) : RecyclerView.Adapter<CreditsAdapter.CreditsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CreditsViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.list_item_profile_credit_top_contributor, parent, false)
        view.findViewById<TextView>(R.id.tv_contribution_amount_list_item_profiles_credits_top_contributors).visibility = View.GONE
        return CreditsViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: CreditsViewHolder, position: Int) {
        val credit = creditsList[position]
    }

    override fun getItemCount() = creditsList.size

    inner class CreditsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val ivUserProfilePicture = itemView.findViewById<ImageView>(R.id.iv_user_profile_picture_list_item_profiles_credits_top_contributors)
        val tvUserFullName = itemView.findViewById<TextView>(R.id.tv_user_full_name_list_item_profiles_credits_top_contributors)
        val tvContributionType = itemView.findViewById<TextView>(R.id.tv_contribution_type_list_item_profiles_credits_top_contributors)
        val ivEmail = itemView.findViewById<ImageView>(R.id.iv_email_list_item_profiles_credits_top_contributors)
        val ivGithub = itemView.findViewById<ImageView>(R.id.iv_github_list_item_profiles_credits_top_contributors)
        val ivFacebook = itemView.findViewById<ImageView>(R.id.iv_facebook_list_item_profiles_credits_top_contributors)
        val ivTwitter = itemView.findViewById<ImageView>(R.id.iv_twitter_list_item_profiles_credits_top_contributors)
        val ivInstagram = itemView.findViewById<ImageView>(R.id.iv_instagram_list_item_profiles_credits_top_contributors)
    }

}