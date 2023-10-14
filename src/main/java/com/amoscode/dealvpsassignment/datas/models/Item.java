package com.amoscode.dealvpsassignment.datas.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private int id;

    private String name;

    private String description;
    private final LocalDateTime dateAdded = LocalDateTime.now();
}
