package kraf.george.chooseadventure


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kraf.george.chooseadventure.databinding.FragmentWashBinding

class Wash : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentWashBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_wash, container, false)
        binding.btnKitchenWin.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_wash_to_kitchenWin) }
        return binding.root
    }


}
