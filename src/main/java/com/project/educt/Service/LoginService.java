package com.project.educt.Service;

import com.project.educt.Model.Entity.LoginEntity;

import java.util.List;

public interface LoginService {
    List<LoginEntity> findAllLogin();
    LoginEntity saveLogin(LoginEntity loginEntity);
}
