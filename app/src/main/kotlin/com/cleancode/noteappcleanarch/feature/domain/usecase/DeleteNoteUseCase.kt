package com.cleancode.noteappcleanarch.feature.domain.usecase

import com.cleancode.noteappcleanarch.feature.domain.model.Note
import com.cleancode.noteappcleanarch.feature.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}