package webtoken.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webtoken.jwt.data.model.AppUser;

public interface AppUserRepo extends JpaRepository<AppUser,Long> {
    AppUser findByUserName(String username);
}
