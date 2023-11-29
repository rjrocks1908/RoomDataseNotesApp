package com.haxon.roomdatasenotesapp.di

import android.app.Application
import androidx.room.Room
import com.haxon.roomdatasenotesapp.data.NoteDao
import com.haxon.roomdatasenotesapp.data.NotesDatabase
import com.haxon.roomdatasenotesapp.data.NotesRepository
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
    fun provideNoteDatabase(app: Application): NoteDao {
        return Room.databaseBuilder(
            app,
            NotesDatabase::class.java,
            "notes.db",
        ).build().dao
    }

    @Provides
    @Singleton
    fun providesNotesRepository(dao: NoteDao): NotesRepository {
        return NotesRepository(dao)
    }

}