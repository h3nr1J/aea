package rodrigo.fer.apkmovies_udemy_rh.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import rodrigo.fer.apkmovies_udemy_rh.R
import rodrigo.fer.apkmovies_udemy_rh.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {


    // Lainit -> Es una promesa que " var " se va ejcutar si o si
    // ademas va a priorizar la ejecucion de la variable

    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       // Inicializar Binding!
        binding = FragmentMainBinding.bind(view)
        }


}