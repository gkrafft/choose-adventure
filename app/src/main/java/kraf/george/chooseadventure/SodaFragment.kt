package kraf.george.chooseadventure

import android.content.Context
import android.databinding.DataBindingUtil
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kraf.george.chooseadventure.databinding.FragmentSodaBinding


class SodaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSodaBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_soda, container, false)
        binding.phoneButton.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_sodaFragment_to_phoneFragment) }
        binding.catButton.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_sodaFragment_to_catFragment) }
        return binding.root
    }

}
