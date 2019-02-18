package kraf.george.chooseadventure


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kraf.george.chooseadventure.databinding.FragmentKitchenBinding


class Kitchen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentKitchenBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_kitchen, container, false)
        binding.btnNoWash.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_kitchen_to_noWash) }
        binding.btnWash.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_kitchen_to_wash) }
        return binding.root
    }


}
