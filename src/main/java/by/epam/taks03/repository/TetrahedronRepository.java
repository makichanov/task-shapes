package by.epam.taks03.repository;

import by.epam.taks03.entity.Tetrahedron;

import java.util.ArrayList;
import java.util.List;

public class TetrahedronRepository {
    private List<Tetrahedron> tetrahedrons = new ArrayList<>();

    public boolean add(Tetrahedron tetrahedron) {
        return tetrahedrons.add(tetrahedron);
    }

    public boolean remove(Object o) {
        return tetrahedrons.remove(o);
    }

    public Tetrahedron get(int index) {
        return tetrahedrons.get(index);
    }
}
