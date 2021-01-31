package com.example.androidhandson.navigate

import android.os.Bundle
import com.example.androidhandson.databinding.ActivityOneBinding

class OneActivity : BaseNavigateActivity() {

    private val binding: ActivityOneBinding by lazy {
        ActivityOneBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setUpView()
    }

    private fun setUpView() {
        binding.btnNext.setOnClickListener {
            val edtName = binding.edtName.text.toString()

//            Basic Intent
//            val intent = Intent(this, TwoActivity::class.java)
//            intent.putExtra("name", name)
//            startActivity(intent)
//            finish()

//            Companion Intent
            TwoActivity.startIntent(this, TwoModel(name = edtName))
        }
    }
}