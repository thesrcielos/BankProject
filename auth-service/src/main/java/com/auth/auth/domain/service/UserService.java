package com.auth.auth.domain.service;

import com.auth.auth.application.port.out.UserRepositoryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserService {

    private final UserRepositoryPort userRepositoryPort;
}
