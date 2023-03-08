package com.project.educt.Model.Entity;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Table(name="login")
@NoArgsConstructor

public class LoginEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer Number_user;
    private String password;

    public LoginEntity(Long id, Integer number_user, String password) {
        this.id = id;
        Number_user = number_user;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber_user() {
        return Number_user;
    }

    public void setNumber_user(Integer number_user) {
        Number_user = number_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
