package example.controller;

import example.service.role.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by andrei on 3/6/17.
 */
@Controller
public class RolesController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RolesController.class);
    private final RoleService roleService;

    @Autowired
    public RolesController(RoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping(value = "/roles")
    public ModelAndView getRolesPage(){
        LOGGER.debug("Getting roles page");
        return new ModelAndView("roles", "roles", roleService.getAllRoles());
    }
}
