package by.epam.taks03.factory;

import by.epam.taks03.entity.Point;

public class PointFactory {

    public Point create(double x, double y, double z) {
        Point point = new Point(x, y, z);
        return point;
    }
}
