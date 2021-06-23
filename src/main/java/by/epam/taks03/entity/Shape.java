package by.epam.taks03.entity;

public abstract class Shape {
    protected int id;
    protected String name;
    private int lastFreeIdentifier = 0;

    protected int getLastFreeIdentifier() {
        return lastFreeIdentifier++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
