package assignment2_objectoriented;

public class Role {
    private final String name;

    public Role(String name) {
        if (name == null) throw new NullPointerException("name");
        this.name = name;

    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;
        Role other = (Role) o;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
