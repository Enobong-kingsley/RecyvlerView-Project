package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter (private val mContacts: ArrayList<Contact>) : RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return ViewHolder(v)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val contact:Contact = mContacts[position]
        holder.textViewName.text =  contact.name
        holder.textViewAddress.text = contact.address

    }

    override fun getItemCount(): Int {
        return mContacts.size
    }

     class ViewHolder(listItemView: View) : RecyclerView.ViewHolder(listItemView) {

            val textViewName = itemView.findViewById(R.id.textViewUsername) as TextView
            val textViewAddress = itemView.findViewById(R.id.textViewAddress) as TextView

    }
}