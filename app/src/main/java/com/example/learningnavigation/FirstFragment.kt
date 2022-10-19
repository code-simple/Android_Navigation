package com.example.learningnavigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.learningnavigation.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    val binding:FragmentFirstBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_first,container,false)
        binding.btnSecond.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment)
        )
        binding.btnThird.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_thirdFragment)
        )
        return binding.root
    }

}