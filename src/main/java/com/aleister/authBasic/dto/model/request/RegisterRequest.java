package com.aleister.authBasic.dto.model.request;

import lombok.Data;

@Data
public class RegisterRequest {
    private String name;
    private String password;
}
