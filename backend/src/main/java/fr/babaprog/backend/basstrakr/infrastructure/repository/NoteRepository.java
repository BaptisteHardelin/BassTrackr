package fr.babaprog.backend.basstrakr.infrastructure.repository;

import fr.babaprog.backend.basstrakr.infrastructure.entity.NoteEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NoteRepository extends MongoRepository<NoteEntity, String> {

    Optional<NoteEntity> findById(String id);


}
