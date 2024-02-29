package ru.gb.springlesson2;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class User {
    private static long idCounter = 1;

    private final long id;
    private String name;

    public User(String name) {
        this.id = idCounter++;
        this.name = name;
    }

    @JsonCreator
    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
