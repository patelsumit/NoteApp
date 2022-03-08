package com.cleancode.noteappcleanarch.feature.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.noteappcleanarch.ui.theme.*
import java.lang.Exception

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color:Int,
    @PrimaryKey val id: Int? = null
) {
    companion object{
        val noteColor = listOf(RedOrange, RedPink, Violet, BabyBlue, LightGreen)
    }
}

class InvalidNoteException(message: String) : Exception(message)
