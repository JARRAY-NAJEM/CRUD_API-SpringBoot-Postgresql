package com.project.educt.Controller;

import com.project.educt.Model.Entity.LoginEntity;
import com.project.educt.Service.LoginService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;

    }
    @GetMapping("/getAll")
    public List<LoginEntity> findAll(){
        return loginService.findAllLogin();
    };
    @PostMapping("/add")
    public LoginEntity save(@RequestBody LoginEntity loginEntity){
       return loginService.saveLogin(loginEntity);
    } ;
}
