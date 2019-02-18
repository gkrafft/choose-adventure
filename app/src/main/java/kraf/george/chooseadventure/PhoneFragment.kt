package kraf.george.chooseadventure


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kraf.george.chooseadventure.databinding.FragmentPhoneBinding

class PhoneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentPhoneBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_phone, container, false)
        binding.btnPhoneCont.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_phoneFragment_to_sodaLose) }
        return binding.root
    }


}
