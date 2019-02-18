package kraf.george.chooseadventure


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kraf.george.chooseadventure.databinding.FragmentNoWashBinding

class NoWash : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentNoWashBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_no_wash, container, false)
        binding.btnKitchenLose.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_noWash_to_kitchenLose) }
        return binding.root
    }


}
