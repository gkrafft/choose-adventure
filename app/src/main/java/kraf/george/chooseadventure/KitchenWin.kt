package kraf.george.chooseadventure


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kraf.george.chooseadventure.databinding.FragmentKitchenWinBinding

class KitchenWin : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentKitchenWinBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_kitchen_win, container, false)
        binding.btnKitchenWon.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_kitchenWin_to_titleFragment) }
        return binding.root
    }


}
