package com.cleancode.noteappcleanarch.feature.domain.usecase

data class NoteUseCases (
    val getNotesUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNote: AddNote,
    val getNote: GetNoteUseCase
    )