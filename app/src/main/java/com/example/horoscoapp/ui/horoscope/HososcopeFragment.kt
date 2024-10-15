package com.example.horoscoapp.ui.horoscope

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horoscoapp.databinding.FragmentHososcopeBinding

class HososcopeFragment : Fragment() {

    private var _binding: FragmentHososcopeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHososcopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}