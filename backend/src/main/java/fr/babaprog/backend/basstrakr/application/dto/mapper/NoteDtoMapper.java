package fr.babaprog.backend.basstrakr.application.dto.mapper;

import fr.babaprog.backend.basstrakr.application.dto.NoteDto;
import fr.babaprog.backend.basstrakr.domain.model.NoteModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NoteDtoMapper {

    NoteDto map(NoteModel model);

    NoteModel map(NoteDto dto);
}
