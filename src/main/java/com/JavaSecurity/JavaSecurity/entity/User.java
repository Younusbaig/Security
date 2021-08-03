package com.JavaSecurity.JavaSecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_AUTH_TBL")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;
    private String roles;
    private boolean active;
}
