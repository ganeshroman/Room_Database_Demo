package com.example.roomdatabasedemo.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.roomdatabasedemo.dao.NoteRepository
import com.example.roomdatabasedemo.model.Note

class NoteViewModel(app: Application) : AndroidViewModel(app) {

    private val repository = NoteRepository(app)
    private val allNotes = repository.getAllNotes()

    fun insert(note: Note) {
        repository.insert(note)
    }

    fun update(note: Note) {
        repository.update(note)
    }

    fun delete(note: Note) {
        repository.delete(note)
    }

    fun deleteAllNotes() {
        repository.deleteAllNotes()
    }

    fun getAllNotes(): LiveData<List<Note>> {
        return allNotes
    }


}