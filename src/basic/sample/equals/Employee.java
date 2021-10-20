package basic.sample.equals;

import java.util.Objects;

class Employee {
    private int id;
    private String name;
    // constructor
    public Employee(int id, String name) {
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
        Employee employee = (Employee) o;
        return id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
