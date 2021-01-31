package com.example.androidhandson.permission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidhandson.R
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.single.PermissionListener
import android.Manifest
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.androidhandson.databinding.ActivityPermissionBinding
import com.example.androidhandson.databinding.FragmentFirstBinding
import com.example.androidhandson.fragment.ExampleFragmentActivity
import com.example.androidhandson.fragment.SecondFragment
import com.example.androidhandson.navigate.TwoActivity.Companion.startIntent

class PermissionActivity : AppCompatActivity() {
    private val binding: ActivityPermissionBinding by lazy {
        ActivityPermissionBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setUpView()
    }


    private fun requestPermission() {
        Dexter.withContext(this)
            .withPermission(Manifest.permission.CAMERA)
            .withListener(object: PermissionListener {
                override fun onPermissionGranted(grantedResponse: PermissionGrantedResponse?) {
                    TODO("Not yet implemented")
                }

                override fun onPermissionDenied(deniedResponse: PermissionDeniedResponse?) {
                    TODO("Not yet implemented")
                }

                override fun onPermissionRationaleShouldBeShown(
                    request: PermissionRequest?,
                    token: PermissionToken?
                ) {
                    token?.continuePermissionRequest()
                }
            }).check()
    }

    private fun setUpView() {
        binding.btnPermission.setOnClickListener {
            requestPermission()
        }
    }
}