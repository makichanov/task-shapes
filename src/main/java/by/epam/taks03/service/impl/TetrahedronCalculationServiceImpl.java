package by.epam.taks03.service.impl;

import by.epam.taks03.entity.Point;
import by.epam.taks03.entity.Tetrahedron;
import by.epam.taks03.service.TetrahedronCalculationService;

public class TetrahedronCalculationServiceImpl implements TetrahedronCalculationService {

    @Override
    public double calculateSurfaceArea(Tetrahedron target) {
        double edgeLength = calculateEdgeLength(target);
        return Math.sqrt(3) * Math.pow(edgeLength, 2);
    }

    @Override
    public double calculateVolume(Tetrahedron target) {
        double edgeLength = calculateEdgeLength(target);
        return (1./12.) * Math.pow(edgeLength, 3) * Math.sqrt(2);
    }

    @Override
    public double calculateRatio(Tetrahedron target, Point secantPointA) {
        double tetrahedronHeight = Math.abs(target.getBasePointA().getZ() - target.getHeadPoint().getZ());
        double bottomShapeHeight = Math.abs(target.getBasePointA().getZ() - secantPointA.getZ());
        double topShapeHeight = tetrahedronHeight - bottomShapeHeight;
        double tetrahedronEdgeLength = calculateEdgeLength(target);
        double topShapeEdgeLength = (tetrahedronEdgeLength * topShapeHeight) / tetrahedronHeight;
        double tetrahedronVolume = calculateVolume(target);
        double topShapeVolume = (tetrahedronVolume * Math.pow(topShapeEdgeLength, 3))
                / Math.pow(tetrahedronEdgeLength, 3);
        double bottomShapeVolume = tetrahedronVolume - topShapeVolume;
        return topShapeVolume / bottomShapeVolume;
    }

    @Override
    public boolean isTetrahedron(Tetrahedron target) {
        // TODO: 24.06.2021
        return false;
    }

    @Override
    public boolean isBaseBelongsCoordinatePlane(Tetrahedron target) {
        // TODO: 24.06.2021
        return false;
    }

    public double calculateEdgeLength(Tetrahedron target) {
        Point A = target.getBasePointA();
        Point B = target.getBasePointB();
        double dx = Math.abs(A.getX() - B.getX());
        double dy = Math.abs(A.getY() - B.getY());
        double dz = Math.abs(A.getZ() - B.getZ());
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2) + Math.pow(dz, 2));
    }

}
