package com.auth.auth.application.port.in;

import com.auth.auth.infrastructure.dto.Token;

public interface AuthenticationService {
    Token login();

}
