package ru.vsu.cs;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;


import java.util.UUID;

@Getter
@Setter
@Data
@Entity
@Table(name = "usertable")
@Accessors(chain = true)

public class DocumentEntity {


    @Id
    @Column(nullable = false, unique = true, name = "id")
    private UUID id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, unique = true, name = "email")
    private String email;
}
