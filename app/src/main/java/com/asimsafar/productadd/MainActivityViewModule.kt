package com.asimsafar.productadd

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    val productList = mutableListOf<Product>()

    var name = MutableLiveData<String>()
    var surName = MutableLiveData<String>()
    var fullName = MutableLiveData<String>()
     var buttonClickObserver = MutableLiveData<Boolean>()
    fun updateName(prm : String, surname : String) {
        name.postValue(prm)
        surName.postValue(surname)
    }

    fun updateFullname() {
        fullName.postValue("${name.value} ${surName.value}")
    }


       fun onButtonSelected(){
           buttonClickObserver.postValue(true)
       }
    override fun onCleared() {
        super.onCleared()
    }
}