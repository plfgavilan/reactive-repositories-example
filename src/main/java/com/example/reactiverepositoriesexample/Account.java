package com.example.reactiverepositoriesexample;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Account {

    @Id
    private String id;
    private String owner;
    private Double value;

    // getters and setters
}
