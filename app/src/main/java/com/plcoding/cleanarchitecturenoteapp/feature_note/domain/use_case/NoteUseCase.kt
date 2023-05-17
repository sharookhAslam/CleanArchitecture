package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

class NoteUseCase(
    val getNotesUsecase: GetNotesUsecase,
    val deleteNoteUsecase: DeleteNoteUsecase,
    val addNoteUseCase: AddNoteUseCase,
    val getNoteUseCase: GetNoteUseCase
    )