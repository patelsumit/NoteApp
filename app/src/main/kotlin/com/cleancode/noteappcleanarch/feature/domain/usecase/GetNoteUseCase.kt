package com.cleancode.noteappcleanarch.feature.domain.usecase

import com.cleancode.noteappcleanarch.feature.domain.model.Note
import com.cleancode.noteappcleanarch.feature.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note?{
        return repository.getNoteById(id)
    }
}