package com.geeks.noteapp.ui.fragments.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.noteapp.R
import com.geeks.noteapp.databinding.FragmentOnBoardPagingBinding

class OnBoardPagingFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardPagingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardPagingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() = with(binding) {
       when(requireArguments().getInt(ARG_ONBOARD_POSITION)){
           0->{
             txtOnboard.text = "Очень удобный функционал"
               lotti1.visibility = View.VISIBLE
               lotti1.setAnimation(R.raw.lotti1)
               lotti2.visibility = View.GONE
               lotti3.visibility = View.GONE

           }
           1->{
               txtOnboard.text = "Быстрый, качественный продукт"
               lotti1.visibility = View.GONE
               lotti2.visibility = View.VISIBLE
               lotti2.setAnimation(R.raw.lotti2)
               lotti3.visibility = View.GONE

           }
           2->{
               txtOnboard.text  = "Куча функций и интересных фишек"
               lotti1.visibility = View.GONE
               lotti2.visibility = View.GONE
               lotti3.visibility = View.VISIBLE
               lotti3.setAnimation(R.raw.lotti3)
           }
       }
    }

    companion object{
        const val ARG_ONBOARD_POSITION = "onBoard"
    }
}