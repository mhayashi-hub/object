package basic.sample.equals;

import java.util.Objects;

class Employee2 {
    private int id;
    private String name;
    // constructor
    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //
    @Override
    public String toString() {
        return "Employee(" +
                "id= " + id +
                ", name= '" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee = (Employee2) o;
        return id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
