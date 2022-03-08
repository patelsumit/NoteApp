package com.cleancode.noteappcleanarch.feature.domain.usecase

import com.cleancode.noteappcleanarch.feature.domain.model.InvalidNoteException
import com.cleancode.noteappcleanarch.feature.domain.model.Note
import com.cleancode.noteappcleanarch.feature.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()){
            throw InvalidNoteException("Title can't be empty!....")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("Content can't be empty!....")
        }
        repository.insertNote(note)
    }
}