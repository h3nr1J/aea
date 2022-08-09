package rodrigo.fer.apkmovies_udemy_rh.ui.tv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import rodrigo.fer.apkmovies_udemy_rh.R
import rodrigo.fer.apkmovies_udemy_rh.databinding.FragmentMovieBinding
import rodrigo.fer.apkmovies_udemy_rh.databinding.FragmentTvBinding


class TvFragment : Fragment(R.layout.fragment_tv) {

    private lateinit var binding: FragmentTvBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentTvBinding.bind(view)

    }

}