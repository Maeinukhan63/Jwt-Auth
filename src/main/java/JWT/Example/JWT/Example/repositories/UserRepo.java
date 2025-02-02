package JWT.Example.JWT.Example.repositories;

import JWT.Example.JWT.Example.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, String> {

    public Optional<User> findByEmail(String email);
}
