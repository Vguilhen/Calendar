package com.example.calendar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CalendarAdapter(private val dataSet: Array<String>) :
    RecyclerView.Adapter<CalendarAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(com.google.android.material.R.id.layout)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.calendar_cell, parent, false)
        val layoutParams = LinearLayout.LayoutParams()
            layoutParams.LayoutParams = RelativeLayout.LayoutParams()
        layoutParams.height = (0.16666666)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}


//class CalendarAdapter(view:View) : RecyclerView.ViewHolder(view) {
//    val textView: