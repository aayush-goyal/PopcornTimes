package `in`.aayushgoyal.popcorntimes.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

import androidx.fragment.app.Fragment

import `in`.aayushgoyal.popcorntimes.R as appR

class BasicDetailsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_basic_details, container, false)

        val imageButtonFemale = view.findViewById<ImageButton>(R.id.button_female_fragment_basic_details)
        val imageButtonMale = view.findViewById<ImageButton>(R.id.button_male_fragment_basic_details)

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

        return view
    }

}
