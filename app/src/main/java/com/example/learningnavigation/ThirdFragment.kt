package com.example.learningnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.learningnavigation.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentThirdBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_third,container,false)
        binding.back.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_thirdFragment_to_firstFragment)
        )
        return binding.root
    }
}