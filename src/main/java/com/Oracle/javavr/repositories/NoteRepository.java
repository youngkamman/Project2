package com.Oracle.javavr.repositories;


import com.Oracle.javavr.entites.Note;
import com.Oracle.javavr.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findAllByUserEquals(User user);
}
