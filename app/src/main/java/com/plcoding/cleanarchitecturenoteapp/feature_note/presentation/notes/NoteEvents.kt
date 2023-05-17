package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.notes.components

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder

sealed class NoteEvents{
    data class Order(val noteOrder: NoteOrder):NoteEvents()
    data class DeleteNotes(val note:Note):NoteEvents()
    object RestoreNote:NoteEvents()
    object ToggleOrderSection:NoteEvents()
}
