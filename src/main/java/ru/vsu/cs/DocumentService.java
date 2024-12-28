package ru.vsu.cs;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;


@Service
@RequiredArgsConstructor
public class DocumentService {
    DocumentRepository userRepository;

    public void getAll() {
        System.out.println(this.userRepository.findAll());
    }

    @Transactional
    public void deleteById(UUID id) {//done
        userRepository.deleteById(id);
    }


    public DocumentEntity insert(String name, String email) {
        DocumentEntity documentEntity = new DocumentEntity();
        documentEntity.setId(UUID.randomUUID());
        documentEntity.setName(name);
        documentEntity.setEmail(email);
        userRepository.save(documentEntity);
        return documentEntity;
    }
}
