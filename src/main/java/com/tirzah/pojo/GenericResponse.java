package com.tirzah.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenericResponse {
    private String message;
    private boolean success;
    private String error;
    private Object data;

    public GenericResponse(String message, boolean success, String error) {
        this.message = message;
        this.success = success;
        this.error = error;
    }

}
