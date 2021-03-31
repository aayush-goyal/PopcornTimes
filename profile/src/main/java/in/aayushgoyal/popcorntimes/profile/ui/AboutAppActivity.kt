package `in`.aayushgoyal.popcorntimes.profile.ui

import `in`.aayushgoyal.popcorntimes.profile.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AboutAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_app)

        val tvMadeWithLove = findViewById<TextView>(R.id.tv_text_made_with_love_activity_about_app)
        val textMadeWithLove = "<font color=#EDE2C4>Made with </font>" +
                "<font color=#FF0000>\u2665 </font>" +
                "<font color=#EDE2C4> in <b>India</b>.</font>"
        tvMadeWithLove.text = Html.fromHtml(textMadeWithLove)

        val recyclerViewCredits: RecyclerView = findViewById(R.id.view_recycler_credits_activity_about_app)
        recyclerViewCredits.hasFixedSize()
        recyclerViewCredits.layoutManager = LinearLayoutManager(this)

        val recyclerViewTopContributors: RecyclerView = findViewById(R.id.view_recycler_top_contributors_activity_about_app)
        recyclerViewTopContributors.hasFixedSize()
        recyclerViewTopContributors.layoutManager = LinearLayoutManager(this)

        /* val creditsAdapter = CreditsAdapter(this@AboutAppActivity, creditsList)
        recyclerViewCredits.adapter = creditsAdapter
        creditsAdapter.notifyDataSetChanged()

        val topContributorsAdapter = TopContributorsAdapter(this@AboutAppActivity, topContributorsList)
        recyclerViewTopContributors.adapter = topContributorsAdapter
        topContributorsAdapter.notifyDataSetChanged() */
    }

}
