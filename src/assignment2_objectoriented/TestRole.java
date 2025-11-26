package assignment2_objectoriented;

public class TestRole {
    public static void main(String[] args) {
        Role r = new Role("Engineer");
        System.out.println(r);          // förväntat: Engineer
        System.out.println(r.name());   // förväntat: Engineer
    }
}
