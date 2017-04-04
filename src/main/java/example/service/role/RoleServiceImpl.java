package example.service.role;

import example.domain.RoleCreateForm;
import example.domain.RoleUser;
import example.repository.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by andrei on 2/28/17.
 */
@Service
public class RoleServiceImpl implements RoleService{
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleServiceImpl.class);
    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Optional<RoleUser> getRoleById(long id) {
        LOGGER.debug("Getting role={}", id);
        return Optional.ofNullable(roleRepository.findOne(id));
    }

    @Override
    public Collection<RoleUser> getAllRoles() {
        LOGGER.debug("Getting all roles");
        return roleRepository.findAll();
    }

    @Override
    public RoleUser create(RoleCreateForm form) {
        RoleUser role = new RoleUser();
        role.setName(form.getName());
        role.setDescription(form.getDescription());
        return roleRepository.save(role);
    }
}
