package kraf.george.chooseadventure


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kraf.george.chooseadventure.databinding.FragmentSodaWinBinding


class SodaWin : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSodaWinBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_soda_win, container, false)
        binding.btnSodaWon.setOnClickListener{view: View -> view.findNavController().navigate(R.id.action_sodaWin_to_titleFragment)}
        return binding.root
    }


}
