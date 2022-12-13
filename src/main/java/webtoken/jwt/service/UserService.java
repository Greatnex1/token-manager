package webtoken.jwt.service;

import webtoken.jwt.data.model.AppUser;
import webtoken.jwt.data.model.Role;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String role);
    AppUser getUser(String username);
    List <AppUser> getUsers();

}
