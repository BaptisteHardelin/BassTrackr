package fr.babaprog.backend.basstrakr.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteEntity {

    @Id
    private String id;

    private int stringNumber;

    private int fret;

    private String duration;

    private int beat;
}
