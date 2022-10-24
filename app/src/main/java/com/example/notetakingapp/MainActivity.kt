package com.example.notetakingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var addNotes: FloatingActionButton
    private lateinit var notesRV:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Init views
        addNotes = findViewById(R.id.addNotes)
        notesRV = findViewById(R.id.notesRV)

        // onClick add notes Btn
        addNotes.setOnClickListener{
            startActivity(Intent(this,AddNotesActivity::class.java))
            finish()
        }
    }
}