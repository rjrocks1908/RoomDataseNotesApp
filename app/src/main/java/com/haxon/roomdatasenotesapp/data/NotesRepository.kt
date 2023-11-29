package com.haxon.roomdatasenotesapp.data

import javax.inject.Inject

class NotesRepository @Inject constructor(
    private val dao: NoteDao
) {

    fun getNotesOrderByDateAdded() = dao.getNotesOrderByDateAdded()

    fun getNotesOrderByTitle() = dao.getNotesOrderByTitle()

    suspend fun upsertNote(note: Note) {
        dao.upsertNote(note)
    }

    suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }


}