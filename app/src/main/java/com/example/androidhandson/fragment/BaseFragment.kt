package com.example.androidhandson.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class BaseFragment: Fragment() {

    val logTag: String
        get() = this::class.java.simpleName

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(logTag, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(logTag, "onCreate")

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(logTag, "onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i(logTag, "onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i(logTag, "onStart")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(logTag, "onDetach")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(logTag, "onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(logTag, "onDestroyView")
    }

    override fun onStop() {
        super.onStop()
        Log.i(logTag, "onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.i(logTag, "onPause")
    }
}