package com.cleancode.noteappcleanarch.feature.presentation.note

import com.cleancode.noteappcleanarch.feature.domain.model.Note
import com.cleancode.noteappcleanarch.feature.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOderSection : NotesEvent()
}