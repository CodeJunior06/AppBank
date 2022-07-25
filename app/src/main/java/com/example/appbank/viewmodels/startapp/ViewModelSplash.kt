package com.example.appbank.viewmodels.startapp


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.appbank.base.BaseViewModel
import com.example.appbank.model.ModelSplash
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewModelSplash @Inject constructor(
    private val modelSplash: ModelSplash
) : BaseViewModel() {

    val adminLogin: MutableLiveData<Boolean> = MutableLiveData()

     fun startApp() {
         viewModelScope.launch{
           var rta =  modelSplash()
         }

    }
}