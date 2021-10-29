package com.example.notesappkotlin.adapters.notes_adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.notesappkotlin.R
import com.example.notesappkotlin.models.notes_model.NotesModel
import okio.Utf8.size
import java.nio.file.Files.size
import java.security.AccessControlContext

class NotesAdapter(val notes: List<NotesModel>) : RecyclerView.Adapter<NotesAdapter.NotesHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return NotesHolder(layoutInflater.inflate(
            R.layout.notes_item_list,
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: NotesHolder, position: Int) {
        holder.render(notes[position])
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    class NotesHolder(var view: View): RecyclerView.ViewHolder(view)
    {
        fun render(notes: NotesModel)
        {
            view.findViewById<TextView>(R.id.tvTitle).text = notes.title
        }
    }
}