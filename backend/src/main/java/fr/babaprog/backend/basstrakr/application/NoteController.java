package fr.babaprog.backend.basstrakr.application;

import fr.babaprog.backend.basstrakr.application.dto.NoteDto;
import fr.babaprog.backend.basstrakr.domain.model.NoteModel;
import fr.babaprog.backend.basstrakr.domain.usecase.NoteUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class NoteController {

    private final NoteUseCase noteUseCase;

    @PostMapping("/note")
    public ResponseEntity<NoteDto> saveEntity(
            @RequestBody NoteModel noteModel
            ) {
        return ResponseEntity.ok(noteUseCase.saveNote(noteModel));
    }
}
