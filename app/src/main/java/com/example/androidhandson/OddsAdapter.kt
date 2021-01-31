package com.example.androidhandson

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidhandson.databinding.LayoutRecyclerViewItemBinding

class OddsAdapter(private val oddsess: ArrayList<OddsModel> = arrayListOf()): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val binding = LayoutRecyclerViewItemBinding
           .inflate(LayoutInflater.from(parent.context), parent, false)
        return OddsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is OddsViewHolder -> {
                holder.bind(oddsess[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return oddsess.count()
    }

    fun update(list: List<OddsModel>) {
        oddsess.clear()
        oddsess.addAll(list)
        notifyDataSetChanged()
    }

    class OddsViewHolder(
        private val binding: LayoutRecyclerViewItemBinding
    ): RecyclerView.ViewHolder(binding.root) {

        fun bind(model: OddsModel) {
            binding.imgView.setImageResource(model.image)
            binding.tvName.text = model.name
        }
    }
}