package example.domain;

import javax.persistence.*;

/**
 * Created by andrei on 3/7/17.
 */

public class Coverage {

    private Long id;

    private String name;

    private AccessControlListObject acl;

    public AccessControlListObject getAcl() {
        return acl;
    }

    public void setAcl(AccessControlListObject acl) {
        this.acl = acl;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
