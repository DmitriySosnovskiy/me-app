package com.dsosnovskiy.template.ui.base

import androidx.lifecycle.*
import com.dsosnovskiy.template.data.IRepository

abstract class BaseViewModel : ViewModel() {

    companion object {
        const val TAG = "M_BaseViewModel"
    }

    private val isLoading = MutableLiveData(false)

    fun showLoading() { isLoading.value = true }

    fun hideLoading() { isLoading.value = false }

}