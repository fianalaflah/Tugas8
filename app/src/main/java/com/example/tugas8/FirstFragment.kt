package com.example.tugas8

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.textfield.TextInputEditText

class FirstFragment : Fragment() {
    private var communicationViewModel: CommunicationViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel =
            ViewModelProviders.of(requireActivity()).get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        val nameEditText = view.findViewById<TextInputEditText>(R.id.textInputTextName)
        val alamatEditText = view.findViewById<TextInputEditText>(R.id.textInputAlamat)
        val nomerEditText = view.findViewById<TextInputEditText>(R.id.textInputNomer)


        nameEditText.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int
                ) {
                }

                override fun onTextChanged(
                    charSequence: CharSequence,
                    i: Int, i1: Int, i2: Int
                ) {
                    communicationViewModel!!.setName(charSequence.toString())

                    communicationViewModel!!.setNomer(charSequence.toString())

                        //setName(charSequence.toString())
                }

                override fun afterTextChanged(editable: Editable) {
                }
            })
        alamatEditText.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int
                ) {
                }

                override fun onTextChanged(
                    charSequence: CharSequence,
                    i: Int, i1: Int, i2: Int
                ) {
                    communicationViewModel!!.setAlamat(charSequence.toString())


                    //setName(charSequence.toString())
                }

                override fun afterTextChanged(editable: Editable) {
                }
            })
        nomerEditText.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int
                ) {
                }

                override fun onTextChanged(
                    charSequence: CharSequence,
                    i: Int, i1: Int, i2: Int
                ) {

                    communicationViewModel!!.setNomer(charSequence.toString())

                    //setName(charSequence.toString())
                }

                override fun afterTextChanged(editable: Editable) {
                }
            })
    }

    companion object {
        fun newInstance(): FirstFragment {
            return FirstFragment()

        }
    }
}

