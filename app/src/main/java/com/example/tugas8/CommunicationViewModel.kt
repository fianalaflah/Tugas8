package com.example.tugas8

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()

    val name: LiveData<String>
        get() = mName

    fun setName(name: String) {
        mName.value = name

    }


    private val mAlamat = MutableLiveData<String>()

    val alamat: LiveData<String>
        get() = mAlamat

    fun setAlamat(alamat: String) {
        mAlamat.value = alamat

    }

    private val mNomer = MutableLiveData<String>()

    val nomer: LiveData<String>
        get() = mNomer

    fun setNomer(nomer: String) {
        mNomer.value = nomer

    }

}

