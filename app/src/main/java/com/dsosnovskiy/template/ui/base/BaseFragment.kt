package com.dsosnovskiy.template.ui.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dsosnovskiy.template.ui.MainActivity

abstract class BaseFragment : Fragment() {

    companion object {
        private const val TAG = "M_BaseFragment"
    }

    val root: MainActivity
        get() = activity as MainActivity

    protected abstract val layout: Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(layout, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewCreated: ${this::class.java.canonicalName}")

        super.onViewCreated(view, savedInstanceState)

        setupViews()
    }

    protected abstract fun setupViews()
}