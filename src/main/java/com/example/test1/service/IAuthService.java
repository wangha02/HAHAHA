package com.example.test1.service;

import com.example.test1.model.Auth;

import java.util.List;

public interface IAuthService {
    List<Auth> findAll();

    void save(Auth auth);

    Auth findById(Long id);

    void update(Long id, Auth auth);

    void remove(Long id);
}
