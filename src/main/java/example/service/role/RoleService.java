package example.service.role;



import example.domain.RoleCreateForm;
import example.domain.RoleUser;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by andrei on 2/28/17.
 */
public interface RoleService {
    Optional<RoleUser> getRoleById(long id);

    Collection<RoleUser> getAllRoles();

    RoleUser create(RoleCreateForm form);
}
