package fr.babaprog.backend.basstrakr.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
public class Note {

    @Id
    private String id;

    private int stringNumber;

    private int fret;

    private String duration;

    private int beat;
}
