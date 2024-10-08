package ie.setu.controllers

import ie.setu.models.Note


class NoteApi {
    private var notes = ArrayList<Note>()
    fun add(note: Note): Boolean {
        return notes.add(note)
    }
    fun listAllNotes(): String {
        return if (notes.isEmpty()) {
            "No notes stored"
        } else {
            var listOfNotes = ""
            for (i in notes.indices) {
                listOfNotes += "${i}: ${notes[i]} \n"
            }
            listOfNotes
        }
    }
}

