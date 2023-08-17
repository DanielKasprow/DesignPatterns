package StructuralDesignPatterns.Composite.Challenge;


import java.util.ArrayList;
import java.util.List;

class Supervisor implements Faculty {
    private List<Faculty> facultyList;

    private String name;
    private String departmentName;

    public Supervisor(final String name, final String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        facultyList = new ArrayList<Faculty>();
    }

    @Override
    public String getDetails() {
        return "Name:" + name + ", Department: " + departmentName;

    }

    public List<Faculty> getMyFaculty() {
        return facultyList;
    }

    public void addEmployee(Faculty faculty) {
        facultyList.add(faculty);
    }

    public void removeEmployee(Faculty faculty) {
        facultyList.remove(faculty);
    }
}
