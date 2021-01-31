package com.example.androidhandson.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidhandson.R
import com.example.androidhandson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val oddsAdapter: OddsAdapter by lazy {
        OddsAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setUpView()
    }

    private fun setUpView() {
        binding.rvOdds.adapter = oddsAdapter
        binding.rvOdds.layoutManager = LinearLayoutManager(this)
        oddsAdapter.update(mockOddsModel())
    }

    private fun mockOddsModel(): List<OddsModel> {
        return listOf(
            OddsModel(
                image = R.drawable.logo_odds,
                name = "Name 1"
            ),
            OddsModel(
                image = R.drawable.logo_odds,
                name = "Name 2"
            )
        )
    }
}