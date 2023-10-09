package com.amoscode.dealvpsassignment.datas.dtos;

import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    @NonNull
    private Object message;

    private HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
}
