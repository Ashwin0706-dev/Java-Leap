package com.example.boot1.model;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Data
@Entity
public class Users {
    private String name;
    @Id
    private int id;
}