package kraf.george.chooseadventure


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kraf.george.chooseadventure.databinding.FragmentSodaLoseBinding

class SodaLose : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentSodaLoseBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_soda_lose, container, false)
        binding.btnSodaLost.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_sodaLose_to_titleFragment) }
        return binding.root
    }


}
