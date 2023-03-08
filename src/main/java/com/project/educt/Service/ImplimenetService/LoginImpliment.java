package com.project.educt.Service.ImplimenetService;

import com.project.educt.Model.Entity.LoginEntity;
import com.project.educt.Repository.LoginRepository;
import com.project.educt.Service.LoginService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginImpliment implements LoginService {
    private final LoginRepository loginRepository;

    public LoginImpliment(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public List<LoginEntity> findAllLogin() {
        return loginRepository.findAll();
    }

    @Override
    public LoginEntity saveLogin(LoginEntity loginEntity) {
        return loginRepository.save(loginEntity);
    }
}
