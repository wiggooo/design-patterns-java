package assignment2_objectoriented;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
    private final String name;
    private final String department;
    private final List<Role> roles = new ArrayList<>();

    public Employee(String name, String department, Role initialRole) {
        if (name == null) throw new NullPointerException("name");
        if (department == null) throw new NullPointerException("department");
        if (initialRole == null) throw new NullPointerException("initialRole");
        this.name = name;
        this.department = department;
        this.roles.add(initialRole);
    }

    public String name() { return name; }
    public String department() { return department; }
    public List<Role> roles() { return Collections.unmodifiableList(roles); }

    public void addRole(Role role) {
        if (role == null) throw new NullPointerException("role");
        roles.add(role);
    }

    public boolean removeRole(Role role) {
        return roles.remove(role);
    }

    @Override
    public String toString() {
        return String.format("%s at %s %s", name, department, roles);
    }

}