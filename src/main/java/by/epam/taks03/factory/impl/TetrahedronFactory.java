package by.epam.taks03.factory.impl;

import by.epam.taks03.entity.Point;
import by.epam.taks03.entity.Tetrahedron;
import by.epam.taks03.factory.PointFactory;
import by.epam.taks03.factory.ShapeFactory;

public class TetrahedronFactory extends ShapeFactory {

    private PointFactory pointFactory = new PointFactory();

    @Override
    public Tetrahedron crete(String name, double ... coordinates) {
        Point head = pointFactory.create(coordinates[0], coordinates[1], coordinates[2]);
        Point pointA = pointFactory.create(coordinates[3], coordinates[4], coordinates[5]);
        Point pointB = pointFactory.create(coordinates[6], coordinates[7], coordinates[8]);
        Point pointC = pointFactory.create(coordinates[9], coordinates[10], coordinates[11]);
        return new Tetrahedron(name, head, pointA, pointB, pointC);
    }

}
