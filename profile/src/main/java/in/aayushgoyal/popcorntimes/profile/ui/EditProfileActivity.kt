package `in`.aayushgoyal.popcorntimes.profile.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

import `in`.aayushgoyal.popcorntimes.R as appR
import `in`.aayushgoyal.popcorntimes.profile.R

class EditProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val imageButtonFemale = findViewById<ImageButton>(R.id.button_female_activity_edit_profile)
        val imageButtonMale = findViewById<ImageButton>(R.id.button_male_activity_edit_profile)

        imageButtonFemale.isSelected = false
        imageButtonMale.isSelected = false

        imageButtonFemale.setOnClickListener {
            if(!imageButtonFemale.isSelected) {
                imageButtonFemale.isSelected = true
                imageButtonFemale.setImageResource(appR.drawable.ic_female)
                imageButtonMale.isSelected = false
                imageButtonMale.setImageResource(appR.drawable.ic_male_color_accent_light)
            }
        }

        imageButtonMale.setOnClickListener {
            if(!imageButtonMale.isSelected) {
                imageButtonMale.isSelected = true
                imageButtonMale.setImageResource(appR.drawable.ic_male)
                imageButtonFemale.isSelected = false
                imageButtonFemale.setImageResource(appR.drawable.ic_female_color_accent_light)
            }
        }
    }
}
