package by.epam.taks03.service;

import by.epam.taks03.entity.Point;
import by.epam.taks03.entity.Tetrahedron;

public interface TetrahedronCalculationService {

    double calculateSurfaceArea(Tetrahedron target);

    double calculateVolume(Tetrahedron target);

    double calculateRatio(Tetrahedron target, Point secantPointA);

    boolean isTetrahedron(Tetrahedron target);

    boolean isBaseBelongsCoordinatePlane(Tetrahedron target);
}
