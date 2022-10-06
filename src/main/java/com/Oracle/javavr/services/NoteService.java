package com.Oracle.javavr.services;



import com.Oracle.javavr.dtos.NoteDto;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface NoteService {
    List<NoteDto> getAllNotesByUserId(Long userId);

    @Transactional
    void addNote(NoteDto noteDto, Long userId);

    @Transactional
    void deleteNoteById(Long noteId);

    @Transactional
    void updateNoteById(NoteDto noteDto);

    Optional<NoteDto> getNoteById(Long noteId);
}
