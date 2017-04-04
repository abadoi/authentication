package example.domain;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by andrei on 3/6/17.
 */
public class RoleCreateForm {

    @NotEmpty
    private String name = "";

    @NotEmpty
    private String description = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RoleCreateForm{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
