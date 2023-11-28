package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
import com.example.contactapp.model.Contact

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.new_contact_menu -> {
                val navController = findNavController(R.id.nav_host_fragment)
                navController.navigate(R.id.nav_new_contact)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    companion object {
        val contactList: MutableList<Contact> = mutableListOf<Contact>(
            Contact("Betty Holberton", "555-555-5555", "Betty@gmail.com", 1),
            Contact("Grace Hopper", "123-456-7890", "grace@example.com", 2),
            Contact("Ada Lovelace", "987-654-3210", "ada@example.com", 3),
            Contact("Alan Turing", "111-222-3333", "alan@example.com", 4),
            Contact("Tim Berners-Lee", "999-888-7777", "tim@example.com", 5),
            Contact("Margaret Hamilton", "444-333-2222", "margaret@example.com", 6),
            Contact("John McCarthy", "777-666-5555", "john@example.com", 7),
            Contact("Linus Torvalds", "333-444-5555", "linus@example.com", 8),
            Contact("Donald Knuth", "666-555-4444", "donald@example.com", 9),
            Contact("Grace Murray Hopper", "222-333-4444", "grace.murray@example.com", 10)
        )
    }
}