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
import kraf.george.chooseadventure.databinding.FragmentGameStartBinding


class GameStart : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val binding: FragmentGameStartBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_game_start, container, false)
        binding.btnSodaStart.setOnClickListener{view: View -> view.findNavController().navigate(R.id.action_gameStart_to_sodaFragment)}
        binding.btnKitchenStart.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_gameStart_to_kitchen) }
        return binding.root
    }

}
