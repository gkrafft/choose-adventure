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
import kraf.george.chooseadventure.databinding.FragmentTitleBinding



class TitleFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)
        binding.btnStart.setOnClickListener{view: View -> view.findNavController().navigate(R.id.action_titleFragment_to_gameStart)}
        return binding.root
    }


}
