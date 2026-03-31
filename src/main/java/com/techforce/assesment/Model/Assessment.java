package com.techforce.assesment.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.dialect.function.json.JsonTableSetReturningFunctionTypeResolver;

@Entity
@Table(name = "Assessment")
@Data
public class Assessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private int duration;
}
