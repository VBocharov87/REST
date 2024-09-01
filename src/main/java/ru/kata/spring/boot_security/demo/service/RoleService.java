package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entities.Role;
import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    void setUserRoles(User user, List<Long> roles);
}
