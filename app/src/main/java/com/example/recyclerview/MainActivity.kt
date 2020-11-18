package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var contact: ArrayList<Contact>
    private lateinit var layoutManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        contact = ArrayList()
        addContact()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this,1))
        recyclerView.adapter = ContactsAdapter(contact)

        layoutManager = LinearLayoutManager(this)

    }

    private fun addContact() {
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Faiz Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Faiz Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Faiz Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Faiz Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Faiz Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Faiz Khan", "Ranchi Jharkhand"))
        contact.add(Contact("Belal Khan", "Ranchi Jharkhand"))
    }
}