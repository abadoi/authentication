package example.controller;

import example.domain.RoleCreateForm;
import example.service.role.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by andrei on 3/6/17.
 */
@Controller
public class RoleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);
    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/role/create", method = RequestMethod.GET)
    public ModelAndView getRoleCreatePage(){
        LOGGER.debug("Getting role create form");
        return new ModelAndView("role_create", "form_role", new RoleCreateForm());
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/role/create", method = RequestMethod.POST)
    public String handleRoleCreatePage(@Valid @ModelAttribute("form_role") RoleCreateForm form){
        LOGGER.debug("Processing role create form={}", form);
        roleService.create(form);
        return "redirect:/roles";
    }
}
