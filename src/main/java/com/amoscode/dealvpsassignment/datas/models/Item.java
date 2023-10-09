package com.amoscode.dealvpsassignment.datas.models;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Item {
    private int id;

    private String name;

    private String description;
    private LocalDateTime dateAdded;

}
