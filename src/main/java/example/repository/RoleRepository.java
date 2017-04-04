package example.repository;

import example.domain.RoleUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by andrei on 3/6/17.
 */
public interface RoleRepository extends JpaRepository<RoleUser, Long> {
    Optional<RoleUser> findOneByName(String name);
}
