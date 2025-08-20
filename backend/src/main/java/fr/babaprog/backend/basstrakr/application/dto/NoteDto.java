package fr.babaprog.backend.basstrakr.application.dto;

public record NoteDto(
        int stringNumber,
        int fret,
        String duration,
        int beat
) {
}
