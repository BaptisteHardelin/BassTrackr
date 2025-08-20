package fr.babaprog.backend.basstrakr.infrastructure.adapter;

import fr.babaprog.backend.basstrakr.domain.NotePort;
import fr.babaprog.backend.basstrakr.domain.model.NoteModel;
import fr.babaprog.backend.basstrakr.infrastructure.entity.NoteEntity;
import fr.babaprog.backend.basstrakr.infrastructure.entity.mapper.NoteEntityMapper;
import fr.babaprog.backend.basstrakr.infrastructure.repository.NoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class NoteAdapter implements NotePort {

    private final NoteEntityMapper noteEntityMapper;
    private final NoteRepository noteRepository;


    @Override
    public NoteModel saveNote(NoteEntity entity) {
        return noteEntityMapper.map(noteRepository.save(entity));
    }
}
