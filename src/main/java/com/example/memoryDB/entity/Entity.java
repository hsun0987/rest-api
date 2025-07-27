package com.example.memoryDB.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Entity implements PrimaryKey {
    private Long id;
}
