package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class DeleteNoteUsecase( private val noteRepository: NoteRepository) {

    suspend operator fun invoke(note: Note){
        noteRepository.deleteNote(note)
    }
}