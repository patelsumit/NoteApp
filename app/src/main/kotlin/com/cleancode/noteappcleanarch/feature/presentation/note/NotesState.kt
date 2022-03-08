package com.cleancode.noteappcleanarch.feature.presentation.note

import com.cleancode.noteappcleanarch.feature.domain.model.Note
import com.cleancode.noteappcleanarch.feature.domain.util.NoteOrder
import com.cleancode.noteappcleanarch.feature.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
