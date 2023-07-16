package com.aleister.authBasic.dto.model.response;

import lombok.Data;

@Data
public class LoginResponse {
    private String username;
    private String password;
    private String token;
}
