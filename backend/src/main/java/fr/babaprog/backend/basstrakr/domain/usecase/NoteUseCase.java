package fr.babaprog.backend.basstrakr.domain.usecase;

import fr.babaprog.backend.basstrakr.application.dto.NoteDto;
import fr.babaprog.backend.basstrakr.application.dto.mapper.NoteDtoMapper;
import fr.babaprog.backend.basstrakr.domain.NotePort;
import fr.babaprog.backend.basstrakr.domain.model.NoteModel;
import fr.babaprog.backend.basstrakr.infrastructure.entity.mapper.NoteEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NoteUseCase {

    private final NotePort notePort;
    private final NoteDtoMapper mapper;
    private final NoteEntityMapper noteEntityMapper;

    public NoteDto saveNote(NoteModel model) {
        NoteModel savedNote = notePort.saveNote(noteEntityMapper.map(model));

       return mapper.map(savedNote);
    }
}
