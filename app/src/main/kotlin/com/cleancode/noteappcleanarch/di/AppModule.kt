package com.cleancode.noteappcleanarch.di

import android.app.Application
import androidx.room.Room
import com.cleancode.noteappcleanarch.feature.data.data_source.NoteDatabase
import com.cleancode.noteappcleanarch.feature.data.repository.NoteRepositoryImpl
import com.cleancode.noteappcleanarch.feature.domain.repository.NoteRepository
import com.cleancode.noteappcleanarch.feature.domain.usecase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase{
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases{
        return NoteUseCases(
            getNotesUseCase = GetNotesUseCase(repository),
            deleteNoteUseCase = DeleteNoteUseCase(repository),
            addNote = AddNote(repository),
            getNote = GetNoteUseCase(repository)
        )
    }
}