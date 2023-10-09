package com.amoscode.dealvpsassignment.datas.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddItemRequest {

    // THIS METHOD IS USE TO CONVERT JSON FILES TO THE MODEL OBJECT
    // VALIDATING OF INPUTS
    @NotBlank(message = "Name cannot be blank")
    @NotNull(message = "name should not be null")
    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Name cannot be blank")
    @NotNull(message = "name should not be null")
    @NotEmpty(message = "Name cannot be empty")
    private String description;
}
