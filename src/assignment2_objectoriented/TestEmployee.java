package assignment2_objectoriented;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee("Alex", "R&D", new Role("Engineer"));
        System.out.println(e);

        e.addRole(new Role("Manager"));
        System.out.println(e);

        e.removeRole(new Role("Engineer"));
        System.out.println(e);

    }
}
