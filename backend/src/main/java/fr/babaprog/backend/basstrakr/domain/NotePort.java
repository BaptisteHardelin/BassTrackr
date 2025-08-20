package fr.babaprog.backend.basstrakr.domain;

import fr.babaprog.backend.basstrakr.domain.model.NoteModel;
import fr.babaprog.backend.basstrakr.infrastructure.entity.NoteEntity;

public interface NotePort {

    NoteModel saveNote(NoteEntity entity);
}
