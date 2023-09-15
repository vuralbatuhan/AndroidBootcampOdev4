package com.example.androidbootcampodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.androidbootcampodev4.databinding.FragmentAnaSayfaBinding
import com.example.androidbootcampodev4.databinding.FragmentSayfaABinding


class AnaSayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        binding.buttonAnaToA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anaToSayfaA)
        }
        binding.buttonAnaToX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anaToSayfaX)
        }

        return binding.root
    }

}