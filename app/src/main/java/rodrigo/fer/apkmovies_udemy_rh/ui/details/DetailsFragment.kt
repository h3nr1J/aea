package rodrigo.fer.apkmovies_udemy_rh.ui.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import rodrigo.fer.apkmovies_udemy_rh.R
import rodrigo.fer.apkmovies_udemy_rh.databinding.FragmentDetailsBinding
import rodrigo.fer.apkmovies_udemy_rh.databinding.FragmentMainBinding


class DetailsFragment : Fragment(R.layout.fragment_details) {

    private lateinit var binding: FragmentDetailsBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding = FragmentDetailsBinding.bind(view)

    }
}