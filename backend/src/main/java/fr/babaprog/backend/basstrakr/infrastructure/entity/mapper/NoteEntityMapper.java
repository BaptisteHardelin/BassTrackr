package fr.babaprog.backend.basstrakr.infrastructure.entity.mapper;

import fr.babaprog.backend.basstrakr.domain.model.NoteModel;
import fr.babaprog.backend.basstrakr.infrastructure.entity.NoteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface NoteEntityMapper {

    @Mapping(target = "id", ignore = true)
    NoteEntity map(NoteModel model);

    NoteModel map(NoteEntity entity);
}
