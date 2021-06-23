package by.epam.taks03.entity;

public class Tetrahedron extends Shape {
    private Point headPoint;
    private Point basePointA;
    private Point basePointB;
    private Point basePointC;

    public Tetrahedron(String name, Point headPoint, Point basePointA, Point basePointB, Point basePointC) {
        super.name = name;
        super.id = getLastFreeIdentifier();
        this.headPoint = headPoint;
        this.basePointA = basePointA;
        this.basePointB = basePointB;
        this.basePointC = basePointC;
    }

    public Point getHeadPoint() {
        return headPoint;
    }

    public void setHeadPoint(Point headPoint) {
        this.headPoint = headPoint;
    }

    public Point getBasePointA() {
        return basePointA;
    }

    public void setBasePointA(Point basePointA) {
        this.basePointA = basePointA;
    }

    public Point getBasePointB() {
        return basePointB;
    }

    public void setBasePointB(Point basePointB) {
        this.basePointB = basePointB;
    }

    public Point getBasePointC() {
        return basePointC;
    }

    public void setBasePointC(Point basePointC) {
        this.basePointC = basePointC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tetrahedron that = (Tetrahedron) o;

        if (headPoint != null ? !headPoint.equals(that.headPoint) : that.headPoint != null) return false;
        if (basePointA != null ? !basePointA.equals(that.basePointA) : that.basePointA != null) return false;
        if (basePointB != null ? !basePointB.equals(that.basePointB) : that.basePointB != null) return false;
        return basePointC != null ? basePointC.equals(that.basePointC) : that.basePointC == null;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + ((headPoint == null) ? 0 : headPoint.hashCode());
        hash = 31 * hash + ((basePointA == null) ? 0 : basePointA.hashCode());
        hash = 31 * hash + ((basePointB == null) ? 0 : basePointB.hashCode());
        hash = 31 * hash + ((basePointC == null) ? 0 : basePointC.hashCode());
        return hash;
    }
}
