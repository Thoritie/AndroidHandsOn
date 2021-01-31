package com.example.androidhandson.navigate

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.example.androidhandson.R

class TwoActivity : BaseNavigateActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val name = intent.getStringExtra("name")
//        Log.d(logTag, "Name: $name")
        var twoModel = intent.getParcelableExtra<TwoModel>(EXTRA_TWO_MODEL)
        Log.d(logTag, "Twomodel: ${twoModel?.name}")

        if (twoModel != null) {
            println(twoModel.name)
        }

        twoModel?.let {
            it.name
        }

        twoModel?.apply {

        }

        intent?.extras?.apply {
            twoModel = intent.getParcelableExtra<TwoModel>(EXTRA_TWO_MODEL)
        }



    }



    companion object {
//        private const val EXTRA_NAME = "name"
        private const val EXTRA_TWO_MODEL = "two_model"
        fun startIntent(context: Context, name: TwoModel) {
            Intent(context, TwoActivity::class.java)
            .putExtra(EXTRA_TWO_MODEL, name)
            .run { context.startActivity(this)}
        }
    }
}