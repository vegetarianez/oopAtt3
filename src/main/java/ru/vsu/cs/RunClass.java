package ru.vsu.cs;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RunClass implements CommandLineRunner {

    private final DocumentService documentService;

    @Override
    public void run(String[] args) throws Exception {
        DocumentEntity documentEntity = documentService.insert("User345", "saturday@mail.com");
    }
}
