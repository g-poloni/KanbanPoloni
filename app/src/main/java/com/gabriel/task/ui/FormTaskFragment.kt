package com.gabriel.task.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gabriel.task.R
import com.gabriel.task.databinding.FragmentRegisterBinding
import com.gabriel.task.util.initToolbar
import kotlinx.coroutines.selects.SelectInstance

class FormTaskFragment : Fragment (){

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstance: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_form_task, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar(binding.toolbar)
    }
}