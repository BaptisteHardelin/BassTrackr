package fr.babaprog.backend.basstrakr.domain.model;

public record NoteModel(
        int stringNumber,
        int fret,
        String duration,
        int beat
) {
}
