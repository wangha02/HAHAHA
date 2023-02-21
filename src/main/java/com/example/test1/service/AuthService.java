package com.example.test1.service;

import com.example.test1.model.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService implements IAuthService {
    @Autowired
    IAuthService authService;

    @Override
    public List<Auth> findAll() {
        return authService.findAll();
    }

    @Override
    public void save(Auth auth) {
        authService.save(auth);
    }

    @Override
    public Auth findById(Long id) {
        return authService.findById(id);
    }

    @Override
    public void update(Long id, Auth auth) {
        Auth up1 = authService.findById(id);
        if (up1 != null) {
            up1.setId(auth.getId());
            up1.setFistname(auth.getFistname());
            up1.setLastname(auth.getLastname());
            up1.setEmail(auth.getEmail());
            up1.setPass(auth.getPass());
            up1.setDate(auth.getDate());
        }
    }

    @Override
    public void remove(Long id) {
        Auth auth = findById(id);
        if (auth != null) {
            authService.remove(id);
        }
    }
}
