package com.gabriel.task.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gabriel.task.R
import kotlinx.coroutines.selects.SelectInstance

class FormTaskFragment : Fragment (){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstance: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_form_task, container, false)
    }
}